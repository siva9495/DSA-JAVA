package Strings;

public class StringReverse {
    public static void main(String[] args) {
        String str = "siva";
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
