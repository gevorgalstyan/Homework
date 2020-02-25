import java.util.Scanner;

public class Problem3
{ public static void main (String [] args) {
   Scanner scanner = new Scanner(System.in);
   int n = scanner.nextInt();
    int sum = 0;
    int i = 1;
     while (i <= 10 )  {
        sum = n * i;
        i = i + 1;
        int s = sum;


        System.out.println(sum);
    }
}
}
