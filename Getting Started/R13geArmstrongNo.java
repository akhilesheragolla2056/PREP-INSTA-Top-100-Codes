import java.util.*;
public class R13geArmstrongNo {
    //Funtion to calculate Armstrong Number
    public static boolean rangeOfArmstrongNo(int n){
        int dup=n;
        int arms=0;
        int temp=n;
        //step 1:  count digits
        int count=0;
        while(temp>0){
            count++;
            temp/=10;
        }
        //step 2 : caculate Armstrong sum
        while(n>0){
            int lastDigit=n%10;
            lastDigit=(int)Math.pow(lastDigit,count);
            arms=arms+lastDigit;
            n/=10;

        }
        return dup==arms;
            
        }
        //Function to print Armstrong No in range
        public static void armsNoinRange(int start , int end){
            for(int i=start;i<=end;i++){
                if(rangeOfArmstrongNo(i)){
                    System.out.print(i+" ");

                }
            }
            System.out.println();
        }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
          System.out.print("Enter start of range: ");
        int start=sc.nextInt();
          System.out.print("Enter end of range: ");
        int end=sc.nextInt();
        armsNoinRange(start , end);
    }
    
}
