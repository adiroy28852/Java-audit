import java.util.*;
public class Q6 {
    static int mod= Integer.MAX_VALUE; //to avoid overflow
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(recurfact(a));

    }
    public static int recurfact(int n){
        if (n==0)return 1;
        else return n*recurfact(n-1) %mod;
    }
}
