// Question 3: Password Checker
// (Asked in Accenture OnCampus 10 Aug 2021, Slot 3)

// You are given a function.
// int CheckPassword(char str[], int n);
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
// str is a valid password if it satisfies the below conditions.

// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number
// Assumption:
// Input string will not be empty.

// Example:

// Input 1:
// aA1_67
// Input 2:
// a987 abC012

// Output 1:
// 1
// Output 2:
// 0

import java.util.Scanner;

public class Q3 {

    public static int check(String s) {

        if (s.length() < 4) {
            return 0;
        }
        int start = s.charAt(0) >= '0' && s.charAt(0) <= '9' ? 0 : 1;
        int num = 0;
        int cap = 0;
        int sp = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                num++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                cap++;
            }
            if (s.charAt(i) == ' ' || s.charAt(i) == '/') {
                sp++;
            }

        }

        if (num != 0 && cap != 0 && sp == 0 && start == 1) {
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(check(s));
    }

}
