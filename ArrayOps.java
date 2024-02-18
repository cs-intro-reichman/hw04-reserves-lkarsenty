public class ArrayOps {
    public static void main(String[] args) {


        isSorted(new int[] {1,2,3});
    
    }
    
    public static int findMissingInt (int [] array) {       
 
        int n = array.length;  
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        for (int t = 0; t < n; t++){
            sum = sum - array[t];
        }       
        System.out.println(sum);
 
        return -1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int second = array[0];
        int maxat = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxat = i;
            
            }
        }
        for (int t = 1; t < array.length; t++) {
            if (t == maxat){
             continue;
            } else {
                if (array[t] > second){
                    second = array[t];
                }
            }
         }   
            System.out.println(second);

        return 0;
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
    System.out.println(same);
        
    return false;
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

        System.out.println(increasing || decreasing);

        return false;
    }

}
