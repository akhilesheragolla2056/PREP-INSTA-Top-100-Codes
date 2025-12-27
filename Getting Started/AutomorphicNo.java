import java.util.*;
public class AutomorphicNo {
    public static void automorphicNo(int n){
        int y=n*n;
        if(y%10==n%10){
System.out.println("automorphic No");
        }else{
            System.out.println("Not automorphic No");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        automorphicNo(n);
    }
    
}
