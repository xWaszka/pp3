public class Test{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 7);
        Triangle t1 = new Triangle(7, 8.5);
        Circle c1 = new Circle(3.7);
        System.out.println(r1.area());
        System.out.println(t1.area());
        System.out.println(c1.area());
    }
}
