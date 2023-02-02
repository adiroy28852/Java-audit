import java.util.*;
public class Q5{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        boolean flag=false;
        if(a<0){
            flag=true;
            a*=-1;
        }
        while(a!=0){
            System.out.print(a%10 +" ");
            a/=10;
        }
        if(flag)System.out.println("-");
    }
}
