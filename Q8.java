// Question:8
// (Asked in Accenture OnCampus 12 Aug 2021, Slot 2)

// N-base notation is a system for writing numbers that uses only n different symbols, This symbols are the first n symbols from the given notation list(Including the symbol for o) Decimal to n base notation are (0:0, 1:1, 2:2, 3:3, 4:4, 5:5, 6:6, 7:7, 8:8, 9:9, 10:A,11:B and so on upto 35:Z)

// Implement the following function

// Char* DectoNBase(int n, int num):

// The function accept positive integer n and num Implement the function to calculate the n-base equivalent of num and return the same as a string

// Steps:

// Divide the decimal number by n,Treat the division as the integer division
// Write the the remainder (in  n-base notation)
// Divide the quotient again by n, Treat the division as integer division
// Repeat step 2 and 3 until the quotient is 0
// The n-base value is the sequence of the remainders from last to first
// Assumption:

// 1 < n < = 36

// Example

// Input

// n: 12

// num: 718

// Output

// 4BA

// Explanation

// num       Divisor       quotient       remainder

// 718           12               59                 10(A)

// 59             12                4                   11(B)

// 4               12                0                   4(4)

// Sample Input

// n: 21

// num: 5678

// Sample Output

// CI8

import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int divident = sc.nextInt();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char arr[] = a.toCharArray();

        StringBuilder ans = new StringBuilder();
        while (divident % divisor != 0) {
            int rem = divident % divisor;
            int q = divident / divisor;
            divident = q;
            // System.out.println(rem);
            if (rem >= 0 && rem <= 9) {
                ans.insert(0, rem);
            } else {
                // // System.out.println(arr[rem - 10]);
                ans.insert(0, arr[rem - 10]);

            }
        }
        System.out.println(ans);

    }

}
