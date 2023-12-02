public class Computer {
    String system;
    Processor processor;

    public Computer(String system){
        this.system = system;
        this.processor = new Processor(4,8,3200);
    }
    
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString(){
        return ("System: " + system + " Processor info " + processor.toString());
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("Windows");
        System.out.println(c1);
        c1 = null;
        System.out.println(c1);
    }
}
