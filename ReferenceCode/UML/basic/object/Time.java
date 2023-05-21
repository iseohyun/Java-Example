package basic.object;

// 빈 칸을 채우세요

public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public void printTime(String msg) {
        System.out.println(msg + "> " + hour + " : " + minute + " : " + second);		
    }
    
    protected void getCurrnetTime() {
        
    }
    
    void addSeconds(int second){
        
    }
    
    void addMinute(int minute){
        
    }
    
    void addHour(int hour){
        
    }
    
    public static void main(String[] args) {
        Time t = new Time();
        t.setTime(10, 55, 37);
        t.printTime("Start");
        t.addSeconds(30);
        t.printTime("+30s ");
        t.addSeconds(300);
        t.printTime("+300s");
        t.addMinute(30);
        t.printTime("+30m ");
    }
}
