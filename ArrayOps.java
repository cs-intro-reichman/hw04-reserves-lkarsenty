public class ArrayOps {
    public static void main(String[] args) {


        int [] arr1 = {6,1,2,3,5};
        System.out.println(secondMaxValue(arr1));
        int [] arr2 = {1,2,3,5,0};
        System.out.println(findMissingInt(arr2));
        int [] arr3 = {1};
        System.out.println(findMissingInt(arr3));
        int [] arr4 = {2,0,1};
        System.out.println(isSorted(new int[] {1 ,1 ,7}));
        int [] arr5 = {5,1,0,3,6,4};
        System.out.println(containsTheSameElements(new int[] {1, 2, 1, 1, 2}, new int[] {2, 1}));
    
    }
    
    public static int findMissingInt (int [] array) {
        int arrsum = ((array.length + 1) * (array.length) / 2);
        int sum = 0 ;
        
        for ( int i = 0; i < array.length; i ++) {
            sum = sum + array[i];
        }
        return arrsum - sum;
    }

    public static int secondMaxValue(int [] array) {
        int max = arr[0];
        int second = Integer.MIN_VALUE;
        int maxat = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxat = i;
            
            }
        }
        for (int t = 0; t < arr.length; t++) {
            if (t == maxat){
             continue;
            } 
            if (arr[t] > second){
                second = arr[t];
            }
            
         }              

        return second;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean[] freq = new boolean[9];
        boolean[] freq1 = new boolean[9];
        boolean same = true;

        for (int i = 0; i < 9; i++) {
            for (int t = 0; t < array1.length; t++) {
                if (array1[t] == i) {
                freq[i] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int t = 0; t < array2.length; t++) {
                if (array2[t] == i) {
                freq1[i] = true;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (freq[i] != freq1[i]) {
                same = false;
            }
        }
        
    return same;
   }

    public static boolean isSorted(int [] array) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                increasing = false;
            } else if (array[i] < array[i + 1]) {
                decreasing = false;
            }
        }           

        return increasing || decreasing;
    }
}
