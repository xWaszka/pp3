public class C3 {
    int value = 0;

    public void increase(){
        value++;
    }
    public void decrease(){
        value--;
    }
    public void increase(int n){
        if(n>0){
            value+=n;
        }
    }
    public void decrease(int n){
        if(n>0){
            value-=n;
        }
    }
    public void cancel(){
        value = 0;
    }
    public static void main(String[] args) {
        C3 c = new C3();
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.increase(-3);
        c.decrease(2);
        System.out.println(c.value);
        c.cancel();
        System.out.println(c.value);
    }
    
}
