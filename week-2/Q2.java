import java.util.*;
public class Q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a<7){
            switch(a){
                case 0:{
                    System.out.println("Sunday");
                    break;
                }
                case 1:{
                    System.out.println("Monday");
                    break;
                }
                case 2:{
                    System.out.println("Tuesday");
                    break;
                }
                case 3:{
                    System.out.println("Wednesday");
                    break;
                }
                case 4:{
                    System.out.println("Thursday");
                    break;
                }
                case 5:{
                    System.out.println("Friday");
                    break;
                }
                case 6:{
                    System.out.println("Saturday");
                    break;
                }
            }
        }
        else{
            System.out.println("Not a Valid Day");
        }
    }
}
