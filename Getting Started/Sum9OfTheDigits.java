import java.util.*;
public class Sum9OfTheDigits {
    public static int sumofDigits(int n){
        int sum=0;
         while(n>0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;
         }
         return sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int sum=sumofDigits(n);
        System.out.println(sumofDigits(n));
    }
    
}
