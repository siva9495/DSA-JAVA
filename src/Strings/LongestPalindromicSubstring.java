package Strings;

public class LongestPalindromicSubstring {

    static String LPSubstring(String s){
        int maxlen = 0;
        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i,j+1);
                if(isPalindrome(sub) && sub.length() > maxlen){
                    maxlen = sub.length();
                    longest = sub;
                }
            }
        }

        return longest;
    }

    static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "baba";
        System.out.println(LPSubstring(s));
    }
}
