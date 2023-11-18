public class C6 {
    private String name;
    private float price;
    private boolean imported;

    public String getName() {
        return name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
  

        }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        if(price >0){
            this.price = price;
        }
    }
    public boolean isImported() {
        return imported;
    }
    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public static void main(String[] args) {
        C6 p = new C6();
        p.setName("cOmPuTeR");
        System.out.println(p.getName());
    }
}
