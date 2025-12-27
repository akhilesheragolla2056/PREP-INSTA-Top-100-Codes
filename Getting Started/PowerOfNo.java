import java.util.*;
public class PowerOfNo {
    public static double powerOfNo(double n, double p){
        double res=Math.pow(n,p);
        return res;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double p=sc.nextDouble();
        System.out.println(powerOfNo(n,p));
    }
    
}
