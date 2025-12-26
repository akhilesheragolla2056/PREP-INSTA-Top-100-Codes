//Method 1: Using for Loop
import java.util.Scanner;
public class First3Nuralno {
    public static int firstNnaturalNo(int n){
      int  sum=0;
        for(int i=1; i<=n; i++){
            sum=sum+i;

        }
        return sum;
    }

    //Method 2: Using formula for the Sum   of Nth term
    public static int formulaforTheSum(int n){
        return n * (n + 1) / 2;
    }

    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Natural Number : ");
            int n=sc.nextInt();
            int sum=firstNnaturalNo(n);

            System.out.println("First N natural numbers :");
            for(int i=1;i<=n;i++){
                
                 System.out.print(i+" ");
            }
            System.out.println();
           
            System.out.println("Sum of Numbers: "+sum);
            System.out.println("Sum using formula: " + formulaforTheSum(n));
        }
    }
    
}
