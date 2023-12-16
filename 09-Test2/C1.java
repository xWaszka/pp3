public class C1 {
    public static int counter;
    public static int max;
    public static int smax;
    public static int m1(int[] array1, int[] array2){
        counter=0;
        for(int i =0; i<array1.length;i++){
            for(int j=0; j<array1.length;j++){
                if(array1[i] != array2[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static int m2(int[] array1){
        max=0;
        smax=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]>max){
                max = array1[i];
            }

        }
        for(int j=0;j<array1.length;j++){
            if(array1[j]>smax && array1[j]<max){
                array1[j]=smax;
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int[] arr1 = {22,33,44,55};
        int[] arr2 = {44,55,66,77,88,99};
        
        System.out.println(C1.m1(arr1,arr2));
        System.out.println(C1.m2(arr2));
    }
}