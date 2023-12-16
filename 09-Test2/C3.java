public class C3 {
    private String nazwa;
    public String s;
    public String nazwap;
    public String k;

    public C3(String nazwa) {
        this.nazwa = nazwa;
    }

    public String m1(){
        for(int i=0;i<nazwa.length();i++){
            if(nazwa.substring(i, i+1) == "."){
                s=nazwa.substring(0, i);
            }
        }
        return s;
    }
    public String m2(){
        for(int i=0;i<nazwa.length();i++){
            nazwap = nazwa.substring(i, i+1);
            if(nazwap == "."){
                k=nazwa.substring(i,nazwa.length());
            }
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println(new C3("mypogram.c").m1());
        System.out.println(new C3("mypogram.c").m2());
        String kol ="abc";
    }
}
