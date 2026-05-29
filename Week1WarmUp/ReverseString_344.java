package interviewPreparationMay2026.Week1WarmUp;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReverseString_344 {

/*
 * Question:
 *
 * Leet code Link:
 * https://leetcode.com/problems/reverse-string/description/
 *
 * 344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
 *
 *
 * 1. Inout ->
 * 2. Ouput ->
 * 3. Constraints -> Time Complexity ->
 * 					 and Space Complexity ->
 *
 * 4. Test Data Set
 *
 *
 *
 * 5. Ask for Hint -> (If required)
 *
 * 6. Approaches to Solve:
 * 		Brute Force
 * 		Optimized
 *
 * 7. Pseudo code for Brute Force Approach:
 *    1. Declare the String Builder class
 *    2. Append the given char arr values to this String Builder object
 *    3. Reverse the SB text via inbuilt method
 *    4. Traverse the char array from index 0 to length the of the array
 *    5. assign the each char from the SB text and assign it to char array
 *
 *    Pseudo code for Optimized Approach:
 *    1. Initialize 2 variables R and L and declare it with the values R = 0, L = char array.length - 1
 *    2. Traverse the array from index 0 to length of the array
 *    3. Create temp variable
 *    4. Swap the char array with the following way
 *          temp=s[R];
            s[R]=s[L];
            s[L]=temp;
            R++;
            L--;
       5. add the if statement R==L then break
       6. add the if statement R>L then break
 *
 */

    @Test
    public void testBruteForce() {
        char[] chArr = new char[] {'h', 'e', 'l', 'l', 'o'};
        Assert.assertArrayEquals(testMethod(chArr), new char[] {'o', 'l', 'l', 'e', 'h'});
    }

    @Test
    public void testOptimized01() {
        char[] chArr = new char[] {'h', 'e', 'l', 'l', 'o'};
        Assert.assertArrayEquals(testMethodOptimized(chArr), new char[] {'o', 'l', 'l', 'e', 'h'});
    }

    @Test
    public void testOptimized02() {
        char[] chArr = new char[] {'H','a','n','n','a','h'};
        Assert.assertArrayEquals(testMethodOptimized(chArr), new char[] {'h','a','n','n','a','H'});
    }

//  Brute Force Approach:
    private char[] testMethod(char[] s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s) {
            sb.append(ch);
        }
        sb.reverse();
        String str = sb.toString();
        for (int i = 0; i < str.length(); i++) {
            s[i] = str.charAt(i);
        }
        return s;
    }

//  Optimized Approach:
    private char[] testMethodOptimized(char[] s) {
        int R=0,L=s.length-1;
        char temp;
        for(int i=0;i<s.length;i++) {
            temp=s[R];
            s[R]=s[L];
            s[L]=temp;
            R++;
            L--;
            if(R==L) {
                break;
            }
            if(R>L) {
                break;
            }
        }
        return s;
    }
}
