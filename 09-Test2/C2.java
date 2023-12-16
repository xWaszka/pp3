public class C2{
    static int pos;
    static int neg;
    public static boolean m(int[] numbers){
        pos=0;
        neg=0;
        for(int i =0; i<numbers.length;i++){
            if(numbers[i]>0){
                pos += numbers[i];
            }else{
                neg +=Math.abs(numbers[i]);
            }
        }
        if(pos>neg){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] n1 ={9,3,4,-2,-8};int[] n2={9,0,2,-7,4,-9,1,-5};
        System.out.println(C2.m(n1));
        System.out.println(C2.m(n2));
    }
}