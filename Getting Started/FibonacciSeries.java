 import java.util.*;
public class FibonacciSeries {
    public static void fibonnacciSeries(int n){
        int firstno=0,secondno=1;
        int nextNo;
        for(int i=1;i<=n;i++){
            System.out.print(firstno+",");
            nextNo=firstno+secondno;
            firstno=secondno;
            secondno=nextNo;

        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibonnacciSeries(n);
    }
    
}
//leetcode below code

// class FibonacciSerie  {
//     public static int fibonacci(int n) {
//         if(n==0) return 0;
//         if(n==1) return 1;
//         int firstNo=0;
//         int secondNo=1;
//         int nextNo=0;
//         for(int i=2;i<=n;i++){
//             nextNo=firstNo+secondNo;
//             firstNo=secondNo;
//             secondNo=nextNo;
//         }
//         return nextNo;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
        
//        System.out.println(fibonacci(n));

//     }
// }
