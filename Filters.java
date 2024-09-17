public class Filters{
    private Long pastWeek;
    private Long lastMonth;
    private Long lastThreeMonths;
    private Long custom;
    private Long userId;

    public Long getPastWeek() {
        return pastWeek;
    }
    public void setPastWeek(Long pastWeek) {
        this.pastWeek = pastWeek;
    }
    public Long getLastMonth() {
        return lastMonth;
    }
    public void setLastMonth(Long lastMonth) {
        this.lastMonth = lastMonth;
    }
    public Long getLastThreeMonths() {
        return lastThreeMonths;
    }
    public void setLastThreeMonths(Long lastThreeMonths) {
        this.lastThreeMonths = lastThreeMonths;
    }
    public Long getCustom() {
        return custom;
    }
    public void setCustom(Long custom) {
        this.custom = custom;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

