public class C5 {
    public static String m(String t){
        String text ="";
        for (int i=0; i<t.length();i++){
            if(i<t.length()-1){
                if(i % 2 == 0){
                    text+=t.charAt(i);
                    text+="+";
                }else{
                    text+=t.charAt(i);
                    text+="-";
                }
            }   
        }
        text+=t.charAt(-1);
        return text;
    }
    public static void main(String[] args) {
        System.out.println(C5.m("water"));
    }
}


