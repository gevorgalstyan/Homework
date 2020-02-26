import java.util.Scanner;

public class Problem10 {
    public static void main (String [] args) {
        System.out.println(fuctorial(5));
        System.out.println(fib(10));



    }
    public static int fuctorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fuctorial(n = n - 1);
    }

        public static int fib(int n){
            if (n < 2) {
                return n;
            }

            return fib(n - 1) + fib(n - 2);
        }
    }




