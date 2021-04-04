
/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Example 2:

Input: s = "IV"
Output: 4
Example 3:

Input: s = "IX"
Output: 9
Example 4:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
*/
import java.util.Scanner;

public class LeetCodeRomanToInt {

    public static final String ANSI_PURPLE = "\u001B[35m";

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        
        System.out.println("Enter your roman digit");
        input = sc.nextLine();
        verifyInput(input);
        System.out.println(ANSI_PURPLE + romanInteger(input)+ ANSI_PURPLE);
        sc.close();
    }

    public static void verifyInput(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != 'I'
                    && input.charAt(i) != 'V'
                    && input.charAt(i) != 'X'
                    && input.charAt(i) != 'L'
                    && input.charAt(i) != 'C'
                    && input.charAt(i) != 'D'
                    && input.charAt(i) != 'M') {

                System.err.println("Invalid Characters");
                System.exit(0);
            }
        }
        if(input.length()<1 ||input.length()>15){
            System.err.println("Invalid numbers of characters ");
            System.exit(0);
        }
    }

    public static int romanInteger(String input) {
        int result = 0; // variable inicialized 
        String modifiedString = input;

        for (int i = 0; i < input.length() - 1; i++) {

            int auxValue1 = getInt(input.charAt(i));
            int auxValue2 = getInt(input.charAt(i + 1));

            if (auxValue1 < auxValue2) {
                result = result + (auxValue2 - auxValue1);
                modifiedString = modifiedString.replace(input.substring(i, i + 2), "");
            }
        }

        for (int j = 0; j < modifiedString.length(); j++) {

            result = result + getInt(modifiedString.charAt(j));
        }

        return result;
    }

    public static int getInt(char c) {
        char[] romanChars = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] intValues = {1, 5, 10, 50, 100, 500, 1000};
        int result = 0;

        for (int i = 0; i < romanChars.length; i++) {
            if (romanChars[i] == c) {
                result = intValues[i];
            }
        }

        return result;
    }

}
