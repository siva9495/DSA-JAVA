package Recursion;

public class FibanacciSeries {

    static int fibanacci(int n){
        if(n <= 1){
            return n;
        }else{
            return fibanacci(n-1) + fibanacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(fibanacci(i));
        }
    }
}
