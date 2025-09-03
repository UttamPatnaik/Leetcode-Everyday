/*
Problem: Palindrome Number
Link: https://leetcode.com/problems/palindrome-number/

Explanation / Approach:
- Store the original number in a variable.
- Reverse the digits using modulo and division.
- Compare the reversed number with the original.
- If they are equal → return true, else false.
- Handle negative numbers separately (negative numbers are not palindromes).
- Time Complexity: O(log₁₀(n)) → because we process each digit.
- Space Complexity: O(1)
*/

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // negative numbers cannot be palindrome
        
        int a = x, r = 0;
        while (a > 0) {
            int d = a % 10;
            r = r * 10 + d;
            a = a / 10;
        }
        return x == r;
    }

    public static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        System.out.println(solution.isPalindrome(121));   // true
        System.out.println(solution.isPalindrome(-121));  // false
        System.out.println(solution.isPalindrome(10));    // false
    }
}
