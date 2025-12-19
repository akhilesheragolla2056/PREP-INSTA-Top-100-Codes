//Method 1: Using if-else Statements 
// import java.util.*;

// public class LeapYear {
//     public static void leapYear(int year) {
//         if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//             System.out.println("It is a leapYear : "+year); 
//         }else{
//             System.out.println("It is not a leapYear"+year);
//         }
        
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();
//         leapYear(year);

//     }

// }

//Method 2: Using Ternary Operator
import java.util.*;
public class LeapYear{
    public static String leapYear(int year){
        return (year%400==0 || (year%4==0 && year%100!=0)) ? "Its a leapYear : "+year : "Its not a leapYear : "+year;
    }
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        System.out.println(leapYear(year));
        sc.close();
    }

}
