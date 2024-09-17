import java.time.LocalDate;
import java.time.LocalDateTime;

public class PaymentDetails{
    private long paymentId;
    private long expenseId;
    private LocalDate paymentDate;
    private LocalDateTime paymentTime;
    private long amount;
    private long paymentMethod;
    private long userId;

    public PaymentDetails(long paymentId, long expenseId, LocalDate paymentDate, LocalDateTime paymentTime, long amount, long paymentMethod, long userId) {
        this.paymentId = paymentId;
        this.expenseId = expenseId;
        this.paymentDate = paymentDate;
        this.paymentTime = paymentTime;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.userId = userId;
    }
    public long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }
    public long getExpenseId() {
        return expenseId;
    }
    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }
    public LocalDate getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }
    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
    public long getAmount() {
        return amount;
    }
    public void setAmount(long amount) {
        this.amount = amount;
    }
    public long getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
    @Override
    public String toString() {
        return "PaymentDetails{" +
                "paymentId=" + paymentId +
                ", expenseId=" + expenseId +
                ", paymentDate=" + paymentDate +
                ", paymentTime=" + paymentTime +
                ", amount=" + amount +
                ", paymentMethod=" + paymentMethod +
                ", userId=" + userId +
                '}';
    }
}
