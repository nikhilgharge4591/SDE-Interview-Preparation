import java.util.Arrays;

// Caesar_Cypher_Solution - Easy Level

public class Caesar_Cypher_Solution {

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] newsLetter = new char[str.length()];
        char[] stringInfo = str.toCharArray();
        int newKey = key % 26;
        for(int i = 0; i< str.length(); i++){
            newsLetter[i] = helperFunction(str.charAt(i), newKey);
        }
        return Arrays.toString(newsLetter);
    }

    public static char helperFunction(char character, int key){
        int ascii = character;
        int nlc = ascii + key;

        if (nlc <= 122){
            char charValue = (char) nlc;
            return charValue;
        }else{
            char charValue = (char) (96 + nlc % 122);
            return charValue;
        }
    }

    public static void main(String[] args){
        System.out.println(Caesar_Cypher_Solution.caesarCypherEncryptor("xyz", 2));
    }
}
