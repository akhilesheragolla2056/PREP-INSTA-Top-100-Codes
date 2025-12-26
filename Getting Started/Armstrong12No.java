import java.util.*;
public class Armstrong12No {
    public static boolean armstrongNo(int n){
        int dup=n;
        int arms=0;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }    
        while(n>0){
            int lastDigit=n%10;
            lastDigit=(int)Math.pow(lastDigit,count);
            arms=arms+lastDigit;
            n=n/10;
            
        }

        return dup==arms;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a No : ");
        int n=sc.nextInt();
        if(armstrongNo(n)){
            System.out.println("Its a armstrong No");
        }else{
            System.out.println("Not a armstrong no");
        }
    }
    
}
