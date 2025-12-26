// import java.util.*;
// public class Reverse10OfNo {
//     public static void reverseOfNo(int  n){
//     while(n>0){
//         int lastDigit=n%10;
//         System.out.print(lastDigit+" ");
//         n/=10;
//     }}
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         reverseOfNo(n);

//     }
// }
import java.util.*;
public class Reverse10OfNumber{
    public static void reverseOfNo(int n){
    int rev=0;
    while(n>0){
        int lastDigit=n%10;
        rev=(rev*10)+lastDigit;
        n=n/10;
    }
    System.out.println(rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseOfNo(n);

    }
}