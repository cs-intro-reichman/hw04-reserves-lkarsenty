public class StringOps {

    public static void main(String[] args) {
        
        System.out.println(allIndexOf("Hello world",'l'));
    }

    public static String capVowelsLowRest (String string) {
        
        String result = "";
        char ch = ' ';
        for (int i = 0; i < string.length(); i++){
            ch = string.charAt(i);
            
            if (ch == ' ') { 
                result = result + ch;          
                } else if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u') {
                    result = result + (char) (ch - 32);
                } else if (ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') {
                    result = result + ch;
                } else if (ch >= 'A' && ch <= 'Z'){
                    result = result + (char) (ch + 32);
                } else {     
                    result = result + ch;
                }
        }
        
        return result;
    }

    public static String camelCase (String string) {
        String resultlow = ""; 
        String result = "";      
        int t = 1;
        int space = 0;

          while (string.charAt(space) == ' '){
            space++;
           }
        

        for ( int i = space; i < string.length(); i++) {

           if (Character.isLetter(string.charAt(i))) {            
               if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                    resultlow = resultlow + (char) (string.charAt(i) + 32);
                } else {
                    resultlow = resultlow + string.charAt(i);
                }
            } else {    
            resultlow = resultlow + string.charAt(i);
            }
        }

        if (resultlow.charAt(0) != ' ') {
            result = result + resultlow.charAt(0);
        }

        while (t < resultlow.length()){
        char ch = resultlow.charAt(t);
            if (ch == ' '){
             result = result;
            } else if (resultlow.charAt(t - 1) == ' '){
                   result = result + (char) (ch - 32); 
            } else {
                result = result + ch;
            }
             t++;
        }

        
        return result;
    }

    public static int[] allIndexOf (String string, char chr) {
        
        int length = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == chr)
            length++;
        }

        int result [] = new int[length];
        int index = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                result[index] = i;
                index ++;
            }
        }

         return result;
    }
}
