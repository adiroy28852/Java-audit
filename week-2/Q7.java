import java.util.*;
public class Q7{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Integer: ");
        int a= sc.nextInt();
        System.out.println("Enter Second Integer: ");
        int b= sc.nextInt();

        int temp = a;
        a=b;
        b=temp;

        System.out.println("After swap, the first integer is : "+ a +", the second integer is : "+b);
    }
}
