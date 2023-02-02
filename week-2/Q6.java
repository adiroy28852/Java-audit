import java.util.*;
public class SumProductMinMax3{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Integer: ");
        int a= sc.nextInt();
        System.out.println("Enter Second Integer: ");
        int b= sc.nextInt();
        System.out.println("Enter Thrid Integer: ");
        int c= sc.nextInt();

        System.out.println("The sum is : "+ a+b+c);
        System.out.println("The product is : "+ a*b*c);
        System.out.println("The minimum is : " + Math.min(a, Math.min(b,c)));
        System.out.println("The maximum is : "+ Math.max(a,Math.max(b,c)));
    }
}
