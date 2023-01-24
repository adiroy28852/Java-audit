import java.util.Scanner;
import java.math.*;
public class Q5 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        char c= sc.next().charAt(0);

        if (c=='+')System.out.println(a+b);
        else if(c=='-')System.out.println(Math.abs(a-b));
        else if (c=='*')System.out.println(a*b);
        else if (c=='/')System.out.println((float)a/b);
    } 
}
