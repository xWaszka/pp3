public class C1 {
    public static int different(int[] array1, int[] array2){
        int counter = 0;
        for (int i=0;i<array1.length;i++){
            for (int j=0; j<array2.length;j++){
                if(array1[i] == array2[j]){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static int secondMax(int[] array){
        int max = 0;
        int second = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        for(int j=0;j<array.length;j++){
            if(array[j]>second){
                if(array[j]<max){
                    second=array[j];
                }
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr1 = {22,33,44,55};
        int[] arr2 = {44,55,66,77,88,99};
        System.out.println(C1.different(arr1, arr2));
        System.out.println(C1.secondMax(arr1));
    }
}
