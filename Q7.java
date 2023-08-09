// Question:7
// (Asked in Accenture OnCampus 12 Aug 2021, Slot 1)

// Implement the following Function

// def ProductSmallestPair(sum, arr)

// The function accepts an integers sum and an integer array arr of size n. Implement the function to find the pair, (arr[j], arr[k]) where j!=k, Such that arr[j] and arr[k] are the least two elements of array (arr[j] + arr[k] <= sum) and return the product of element of this pair

// NOTE

// Return -1 if array is empty or if n<2
// Return 0, if no such pairs found
// All computed values lie within integer range
// Example

// Input

// sum:9

// size of Arr = 7

// Arr:5 2 4 3 9 7 1

// Output

// 2

// Explanation

// Pair of least two element is (2, 1) 2 + 1 = 3 < 9, Product of (2, 1) 2*1 = 2. Thus, output is 2

// Sample Input

// sum:4

// size of Arr = 6

// Arr:9 8 3 -7 3 9

// Sample Output

// -21

import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = SortArray(arr, 0, size - 1);

        int c = ans[0] + ans[1];
        if (c <= sum) {
            System.out.println(ans[0] * ans[1]);
        } else {
            System.out.println("-1");
        }

    }

    public static int[] Merge_two_Sorted_Array(int[] firstarr, int[] secondarr) {
        int n = firstarr.length;
        int m = secondarr.length;
        int[] ans = new int[n + m];
        int i = 0; // first array
        int j = 0; // second araay
        int k = 0; // for answer array
        while (i < n && j < m) {

            if (firstarr[i] <= secondarr[j]) {
                ans[k] = firstarr[i];
                i++;
                k++;
            } else {
                ans[k] = secondarr[j];
                j++;
                k++;
            }
        }
        while (i < n) {
            ans[k] = firstarr[i];
            i++;
            k++;
        }

        while (j < m) {
            ans[k] = secondarr[j];
            j++;
            k++;
        }
        return ans;
    }

    public static int[] SortArray(int[] arr, int low, int high) {

        if (low == high) {
            int[] a = new int[1];
            a[0] = arr[low];
            return a;
        }

        int mid = (low + high) / 2;
        int[] firstsortedarray = SortArray(arr, low, mid); // divide
        int[] Secondsortarray = SortArray(arr, mid + 1, high); // divide
        return Merge_two_Sorted_Array(firstsortedarray, Secondsortarray); // conquer

    }
}
