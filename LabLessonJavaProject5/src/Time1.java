import java.time.LocalTime;

public class Time1 {
    private int hour;// 0-23
    private int minute;//0-59
    private int second;//0-59
    public Time1(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    public void setHour(int hour){
        if(hour<0 || hour>24)
            throw new IllegalArgumentException("Wrong Hour");
        this.hour=hour;

    }
    public void setMinute(int minute){
        if(minute<0 || minute>60)
            throw new IllegalArgumentException("Wrong Minute");
        this.minute=minute;

    }

    public void setSecond(int second){
        if(second<0 || second>60)
            throw new IllegalArgumentException("Wrong Second");
        this.second=second;

    }
    public String toUniversalString(){

        return String.format(+hour+":"+minute+":"+second+(hour<12?"AM":"PM"));
    }

   // public String toString(){
    //    return String.format("%d:%02d:%02d %s",((hour==0 || hour==12)?12 :hour %12),minute,second,(hour<12? "AM":"PM"));    }

}
