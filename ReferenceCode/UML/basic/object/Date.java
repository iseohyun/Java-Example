package basic.object;

@SuppressWarnings("unused")
public class Date {
    private int year;
    private int month;
    private int day;
    
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public Date getDate() {
        return this;
    }
}
