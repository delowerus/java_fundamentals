package strings;

public class PrintString {

    public static int printLength(String s){
        int len = s.length();
        for(int i = 0; i<len; i++){
        }
        return len;
    }
    public static void main(String[] args) {
        String str = "I love programming";
        System.out.println(printLength(str));
    }

}
