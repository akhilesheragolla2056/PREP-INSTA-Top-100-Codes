import java.util.*;
public class StrongNu {
    public static int factorial(int num){
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        return fact;
    }
    
    public static boolean strongNumber(int n){
        int dup=n;
        int sum=0;
        while(dup>0){
            int digit=dup%10;
            sum=sum+factorial(digit)    ;
            dup=dup/10;
        }
        return n==sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(strongNumber(n)){
            System.out.println("Its a strong number");
        }else{
            System.out.println("Its not a strong number");
        }
    }
    
}
