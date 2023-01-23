import java.util.*;
public class Q8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        // System.out.println(a +" " +b);
        swapper(a,b);

    }
        public static void swapper(int a, int b){
            int temp = a;
            a= b;
            b= temp;
            System.out.println(a +" "+ b);

        }

    
}