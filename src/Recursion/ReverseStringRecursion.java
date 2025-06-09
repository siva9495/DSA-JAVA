package Recursion;

public class ReverseStringRecursion {

    static void reverseString(char[] s){
        reverseHelper(s,0,s.length-1);
    }

    static void reverseHelper(char[] s, int left, int right){
        if(left >= right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseHelper(s,left+1,right-1);
    }

    public static void main(String[] args) {
        char[] ch = {'h','e','l','l','o'};
        reverseString(ch);
        for(int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
    }
}
