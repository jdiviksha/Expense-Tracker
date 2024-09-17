public class ExpenseCategory {
    private Long expenseId;
    private Long groceries;
    private Long leisure;
    private Long bills;
    private Long loanEMI;
    private Long healthAndMedicine;
    private Long utilities;

    public Long getExpenseId() {
        return expenseId;
    }
    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }
    public Long getGroceries() {
        return groceries;
    }
    public void setGroceries(Long groceries) {
        this.groceries = groceries;
    }
    public Long getLeisure() {
        return leisure;
    }
    public void setLeisure(Long leisure) {
        this.leisure = leisure;
    }
    public Long getBills() {
        return bills;
    }
    public void setBills(Long bills) {
        this.bills = bills;
    }
    public Long getLoanEMI() {
        return loanEMI;
    }
    public void setLoanEMI(Long loanEMI) {
        this.loanEMI = loanEMI;
    }
    public Long getHealthAndMedicine() {
        return healthAndMedicine;
    }
    public void setHealthAndMedicine(Long healthAndMedicine) {
        this.healthAndMedicine = healthAndMedicine;
    }
    public Long getUtilities() {
        return utilities;
    }
    public void setUtilities(Long utilities) {
        this.utilities = utilities;
    }
}

public class ExpenseCategoryimpl implements ExpenseCategory{

    //categories,transaction store
    private static final int MAX_CATEGORIES = 100;
    private static final int MAX_TRANSACTIONS = 100;

    private ExpenseCategory[] categories = new ExpenseCategory[MAX_CATEGORIES];
    private Transaction[][] transactions = new Transaction[MAX_CATEGORIES][MAX_TRANSACTIONS];

    private int categoryIdCounter = 1;
    private int categoryCount = 0;
    @Override
    public ExpenseCategory[] findAll(Integer userId) {
        // array to get category from user
        ExpenseCategory[] userCategories = new ExpenseCategory[MAX_CATEGORIES];
        int resultIndex = 0;

        // ++ to get category user asked
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getUserId().equals(userId)) {
                // total expense of all category each each
                double totalExpense = calculateTotalExpense(categories[i].getExpenseId());
                categories[i].setTotalExpense(totalExpense);
                userCategories[resultIndex++] = categories[i];
            }
        }

        // Return a trimmed array containing only valid categories
        ExpenseCategory[] result = new ExpenseCategory[resultIndex];
        System.arraycopy(userCategories, 0, result, 0, resultIndex);
        return result;
    }

    @Override
    public ExpenseCategory findById(Integer userId, Integer categoryId) {
        // Search catId ,userId
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getExpenseId().equals(categoryId) && categories[i].getUserId().equals(userId)) {
                double totalExpense = calculateTotalExpense(categoryId);
                categories[i].setTotalExpense(totalExpense);
                return categories[i];
            }
        }
        //not found
        return null;
    }

    @Override
    public Integer create(Integer userId, String title, String description) {
        // Check if the repository can still hold more categories
        if (categoryCount >= MAX_CATEGORIES) {
            // Category limit reached, return null
            return null;
        }

        // Create a new category with a unique ID and add it to the array
        ExpenseCategory newCategory = new ExpenseCategory(categoryIdCounter, userId, title, description, 0.0);
        categories[categoryCount++] = newCategory;
        return categoryIdCounter++;
    }

    @Override
    public boolean update(Integer userId, Integer categoryId, ExpenseCategory category) {
        // Find the category by ID and update its title and description
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getExpenseId().equals(categoryId) && categories[i].getUserId().equals(userId)) {
                categories[i].setTitle(category.getTitle());
                categories[i].setDescription(category.getDescription());
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean removeById(Integer userId, Integer categoryId) {
        // Find the category and remove it, along with its transactions
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getExpenseId().equals(categoryId) && categories[i].getUserId().equals(userId)) {
                // Remove all transactions associated with this category
                clearCategoryTransactions(i);

                // Shift categories to the left to fill the gap
                for (int j = i; j < categoryCount - 1; j++) {
                    categories[j] = categories[j + 1];
                }
                categories[--categoryCount] = null;
                return true;
            }
        }

        // If category is not found, return false
        return false;
    }

    private void clearCategoryTransactions(int categoryIndex) {
        // Clear all transactions for a given category
        for (int i = 0; i < MAX_TRANSACTIONS; i++) {
            transactions[categoryIndex][i] = null;
        }
    }

    private double calculateTotalExpense(Integer categoryId) {
        double total = 0.0;
        for (int i = 0; i < categoryCount; i++) {
            if (categories[i].getExpenseId().equals(categoryId)) {
                // Sum up all the valid transactions for the category
                for (Transaction transaction : transactions[i]) {
                    if (transaction != null) {
                        total += transaction.getAmount();
                    }
                }
                break;
            }
        }
        return total;
    }
}

