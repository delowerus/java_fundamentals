package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "programming";
        System.out.println(printReverse(str));
        System.out.println(reverseChar(str));
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
        int left = 0, right = chars.length - 1;
        while (left < right){
            char temp = chars[left]; //temp = 'p'
            chars[left] = chars[right]; //{'g', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'}
            chars[right] = temp; //{'g', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'p'}

            left++;
            right--;
        }

        return String.valueOf(chars); //new String(chars);
    }
}
