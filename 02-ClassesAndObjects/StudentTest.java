public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Peter";
        s1.age = 21;
        s1.idCard = 101;
        s1.idCardValid = false;
        s1.sNum = 3;
        s1.avgGrade = 3.8f;



        Student s2 = new Student();
        s2.name = "John";
        s2.age = 24;
        s2.idCard = 211;
        s2.idCardValid = true;
        s2.sNum = 5;
        s2.avgGrade = 4.2f;

        // System.out.println(s1.name + " " + s1.age);
        // System.out.println(s2.name + " " + s2.age);
        // System.out.println();

        // s1.sayHello();
        // s1.displayName();
        // s1.displayAge();

        // System.out.println();

        // s2.sayHello();
        // s2.displayName();
        // s2.displayAge();
        s1.displayInfo();
        s1.idValid();
        s1.displayIdInfo();
        System.out.println();
        s2.displayInfo();
        s2.idNotValid();
        s2.displayIdInfo();

    }
}
