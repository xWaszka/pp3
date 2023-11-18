public class C4 {
    private int hour;
    private int minute;

    public C4(int hour, int minute){
        if(hour<24){
            this.hour = hour;
        }
        if(minute<60){
            this.minute = minute;
        }
    }
    public void add(){
        minute++;
        if(minute>=60){
            if(minute == 60){
            minute = 0;
            }else {
                minute = 0;
                minute++;
        }
        if(hour<23){
            hour++;
        }else {
            hour = 0;
        }
    }
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour<24){
            this.hour = hour;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute<60){
            this.minute = minute;
        }
    }

    public static void main(String[] args) {
        C4 c = new C4(23,58);
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());
        c.add();
        System.out.println(c.getHour());
        System.out.println(c.getMinute());

    }
    
}
