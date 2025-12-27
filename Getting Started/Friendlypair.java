import java.util.*;
public class Friendlypair {
    public static int frdlyPair(int n){
        int sum=0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                sum+=i;
            }
            
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum1=frdlyPair(n1);
        int sum2=frdlyPair(n2);
        if(sum1/n1==sum2/n2){
            System.out.println(n1+" & "+n2+" are friendlyPairs");
        }else{
            System.out.println(n1+" & "+n2+" are not freindlyPairs");
        }

    }
    
}
