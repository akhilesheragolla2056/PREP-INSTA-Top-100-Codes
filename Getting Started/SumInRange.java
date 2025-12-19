// import java.util.Scanner;

// public class SumInRange {
//     public static int sumInRange(int a, int b) {
//         int sum = 0;
//         for (int i = a; i <= b; i++) {
//             sum = sum + i;
//         }
//         return sum;
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         System.out.println(sumInRange(a, b));
//         sc.close();
//     }

// }
//Method 2: Using the Sum of the Numbers in a Given Interval in Java
import java.util.Scanner;
public class SumInRange{
    public static int sumInRange(int a, int b){
        int sum=0;
        sum=b*(b+1)/2-a*(a+1)/2+a;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sumInRange(a,b));
    }
}