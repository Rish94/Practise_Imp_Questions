
// Question 4:
// (Asked in Accenture OnCampus 11 Aug 2021, Slot 1)

// You are given a function,
// int findCount(int arr[], int length, int num, int diff);

// The function accepts an integer array ‘arr’, its length and two integer variables ‘num’ and ‘diff’. Implement this function to find and return the number of elements of ‘arr’ having an absolute difference of less than or equal to ‘diff’ with ‘num’.
// Note: In case there is no element in ‘arr’ whose absolute difference with ‘num’ is less than or equal to ‘diff’, return -1.

// Example:
// Input:

// arr: 12 3 14 56 77 13
// num: 13
// diff: 2
// Output:
// 3

// Explanation:
// Elements of ‘arr’ having absolute difference of less than or equal to ‘diff’ i.e. 2 with ‘num’ i.e. 13 are 12, 13 and 14.

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        // System.out.println(s);
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        int num = sc.nextInt();
        int diff = sc.nextInt();
        int c = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int n = (int) arr[i];
            if (Math.abs(arr[arr.length - 2] - n) <= arr[arr.length - 1]) {
                c++;
            }
        }

        System.out.println(c);

    }

}
