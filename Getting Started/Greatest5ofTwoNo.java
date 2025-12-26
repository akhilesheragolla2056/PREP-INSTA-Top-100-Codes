// //Method 1: Using if-else Statements
// import java.util.Scanner;
// public class GreatestofTwoNo {
//     public static int greatestOfTwoNo(int a, int b){
//         if(a>b){
//             return a;
//         } else if(a<b){
//             return b;
//         } else {
//             return 0;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(greatestOfTwoNo(a,b));
//     }
    
// }
//Method 2: Using Ternary Operator
// import java.util.*;
// public class GreatestofTwoNo{
//     public static int greatestOfTwoNo(int a, int b){
//         return (a>b)?a:b;

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         System.out.println(greatestOfTwoNo(a,b));
//     }

// }

//Method 3: Using inbuilt max Function
import java.util.*;
public class Greatest5ofTwoNo{
    public static  int greatestOfTwoNo(int a, int b){
        if(a==b){
            return 0;
        }else{
            return Math.max(a,b);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The greatest Number is :");
        System.out.println(greatestOfTwoNo(a,b));
    }
    
}