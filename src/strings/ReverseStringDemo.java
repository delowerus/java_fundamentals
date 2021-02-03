package strings;

import java.util.Arrays;

public class ReverseStringDemo {
    public static void main(String[] args) {
        String str = "programming";
        //System.out.println(printReverse(str));
        System.out.println("Rev String: " + reverseChar(str));
    }

    public static String printReverse(String s){
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }

    public static String reverseChar(String string){
        char[] chars = string.toCharArray();
        System.out.println(Arrays.toString(chars));
        int left = 0, right = chars.length - 1;
        while (left < right){
            char temp = chars[left]; //temp = 'p'
            chars[left] = chars[right]; //{'g', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'}
            chars[right] = temp; //{'g', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'p'}

            left++;
            right--;

            System.out.println(Arrays.toString(chars));
        }

        return String.valueOf(chars); //new String(chars);
    }
}
