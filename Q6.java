// Question:6
// (Asked in Accenture OnCampus 11 Aug 2021, Slot 3)

// You are required to implement the following Function 

// def LargeSmallSum(arr)

// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

// Assumption:

// All array elements are unique
// Treat the 0th position as even
// NOTE

// Return 0 if array is empty
// Return 0, if array length is 3 or less than 3
// Example

// Input

// arr:3 2 1 7 5 4

// Output

// 7

// Explanation

// Second largest among even position elements(1 3 5) is 3
// Second smallest among odd position element is 4
// Thus output is 3+4 = 7
// Sample Input

// arr:1 8 0 2 3 5 6

// Sample Output

// 8

import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int evenlargestfirst = Integer.MIN_VALUE;
        int oddsmallestfirst = Integer.MAX_VALUE;

        // first largest even pos par
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && arr[i] > evenlargestfirst) {
                evenlargestfirst = arr[i];
            }
        }

        // first smalest odd pos par
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0 && arr[i] < oddsmallestfirst) {
                oddsmallestfirst = arr[i];
            }
        }

        // System.out.println(evenlargestfirst);
        // System.out.println(oddsmallestfirst);

        int secondlargestevenpar = Integer.MIN_VALUE;
        int secondSmalestoddpar = Integer.MAX_VALUE;

        // find second largest even par
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > secondlargestevenpar && arr[i] < evenlargestfirst) {
                    secondlargestevenpar = arr[i];

                }
            }
        }

        // find second min on odd pos
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                if (arr[i] < secondSmalestoddpar && arr[i] > oddsmallestfirst) {
                    secondSmalestoddpar = arr[i];

                }
            }
        }

        // System.out.println(secondlargestevenpar);
        // System.out.println(secondSmalestoddpar);
        System.out.println(secondSmalestoddpar + secondlargestevenpar);

    }

}
