import java.util.*;
public class HarshadNu {
    public static int harshadNumber(int n){
        int sum=0;
        while(n>0){
            int l=n%10;
            sum=sum+l;
            n/=10;
        }
        if(sum!=0 && n%sum==0){
            return 1;
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(harshadNumber(n)==1){
            System.out.println("It is a harshed No");
        }else{
            System.out.println("Not a Harshad No");
        }
        //System.out.println(harshadNumber(n));
    }
    
}
