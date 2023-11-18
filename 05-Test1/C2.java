public class C2 {
    private int hours;
    private int minutes;

    public C2(int hours,int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public int minutes(){
        int mins = 0;
        mins +=hours*60;
        mins +=minutes;
        return mins;
    }
    public String toString(){
        if(hours <10){
            if(minutes<10){
                return ("0"+hours+":0"+minutes);
            }
        }
        if(hours<10){
            return ("0"+hours+":"+minutes);
        }
        if(minutes<10){
            return (hours+":0"+minutes);
        }

    }
    public static void main(String[] args) {
        C2 o = new C2(2,9);
        System.out.println(o.toString());
    }
}
