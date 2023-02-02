import java.util.*;
public class SumAverageRunningInt{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int LowerBound= sc.nextInt();
        int upperBound= sc.nextInt();
        int res=0;
        for (int i=LowerBound; i<=upperBound; i++){
            res+= i;
        }
        System.out.println("The Sum of "+LowerBound+ "to "+ upperBound + " is "+ res);
        System.out.println("The average is " + (float)res/(upperBound-LowerBound+1));
    }
}
