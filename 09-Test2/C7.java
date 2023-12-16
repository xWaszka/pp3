public class C7 extends Vehicle {
    private int speed;
    public C7(speed,seats){
        super(seats);
        this.speed=speed;
    }
    public int[] spec(){
        int[] specification = {getSeats(),speed};
        return specification;
    }
}   
