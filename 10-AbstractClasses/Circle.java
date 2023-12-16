public class Circle extends Shape{
    double r;

    public Circle(double r){
        this.r=r;
    }
    @Override
    public double area(){
        return Math.PI*Math.pow(r, 2);
    }
}
