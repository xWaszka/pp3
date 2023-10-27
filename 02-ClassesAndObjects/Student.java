public class Student {
    String name;
    int age;
    int idCard;
    boolean idCardValid;
    int sNum;
    float avgGrade;

    void sayHello(){
        System.out.println("Hello from " + name);
    }
    void displayName(){
        System.out.println("Name: " + name);
    }
    void displayAge(){
        System.out.println("Age: " + age);
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Semester: " + sNum);
        System.out.println("Avg grade: " + avgGrade);
    }
    void idValid(){
        idCardValid = true;
    }
    void idNotValid(){
        idCardValid = false;
    }
    void displayIdInfo(){
        System.out.println("Student's name: " + name);
        System.out.println("Student's ID card number: " + idCard);
        System.out.println(idCardValid == true ? "Student's ID card is valid" : "Student's ID card is not valid");
        // if (idCardValid == true){
        //     System.out.println("Student's ID card is valid");
        // }else {
        //     System.out.println("Student's ID card is not valid");
        // }
    }
}
