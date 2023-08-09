// Question 2: 
// (Asked in Accenture OnCampus 10 Aug 2021, Slot 2)

// Problem Description :
// The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

// int OperationsBinaryString(char* str);

// The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

// Note:

// No order of priorities of operations is required
// Length of str is odd
// If str is NULL or None (in case of Python), return -1
// Input:
// str: 1C0C1C1A0B1

// Output:
// 1

// Explanation:
// The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.

// Sample Input:
// 0C1A1B1C1C1B0A0

// Output:
// 0

import java.util.Scanner;
import java.util.Stack;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int prev = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i = i + 2) {

            char op = s.charAt(i);
            int curr = s.charAt(i + 1);

            if (op == 'A') { // A==AND
                prev = prev & curr;
            } else if (op == 'B') { // B == OR
                prev = prev | curr;
            } else { // C == XOR
                prev = prev ^ curr;
            }

        }
        System.out.println((char) prev);

        // Stack<Character> st = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // st.push(s.charAt(i));
        // }
        // int ans = 0;
        // System.out.println(st);
        // while (!st.isEmpty()) {

        // int n1 = st.pop() - '0';
        // System.out.println(n1);
        // char op = st.pop();
        // System.out.println(op);
        // int n2 = st.pop() - '0';
        // System.out.println(n2);
        // int cal = 0;

        // if (op == 'A') {
        // cal = (char) (n1 & n2);
        // } else if (op == 'B') {
        // cal = (char) (n1 | n2);
        // } else {
        // cal = (char) (n1 ^ n2);
        // }
        // st.push((char) cal);
        // ans = cal;

        // }
        // System.out.println(ans);
    }

}
