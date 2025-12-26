import java.util.*;
public class Prime7No {
    public static boolean primeNo(int n){
      // boolean primeNo=true;
        if(n<=1){
            return false;
        }
        if(n==2){
            return true;
        }
            for(int i=2; i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(primeNo(n)){
            System.out.println("It is a prime no");

        }else{
            System.out.println("It is not a prime no");
        }
    }
    
}
