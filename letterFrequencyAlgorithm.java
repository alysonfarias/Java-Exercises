/* output  = https://imgur.com/zRtEqM3
It was inspired on URI Challenge URI Online Judge | 1255
Letter Frequency - https://www.urionlinejudge.com.br/judge/en/problems/view/1255
"In this problem we are interested in the frequency of letters in a given line of text.
Specifically, we want to know the most frequently occurring letter in the text, ignoring case (to be clear, "letters" refers precisely to the 26 letters of the alphabet)."
CODE V
*/
import java.util.Scanner;

public class LetterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isTrue;
        String text;
        int option, i = 1;

        System.out.println("Type the number of tests case");
        option = sc.nextInt();
        sc.nextLine();

        while (i <= option) {
            System.out.println("Type ur string to test");
            text = sc.nextLine();
            isTrue = textValidation(text);
            if (isTrue) {
               testLetters(text);
            }else{
                System.err.println("Invalid text");
            }


            i++;
        }
    }

    public static boolean textValidation(String text) {
        return text.length() >= 1 && text.length() <= 200;
    }

    private static void testLetters(String text) {
        String textWithoutSpacesLower = text.replace(" ", "").toLowerCase();

        int[] letterNumbers = new int[26]; // 0-25
        char[] letters = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int biggerRepetion = 0, position;
        char largestRepeatedLetter = 0;
        for (int i = 0; i < textWithoutSpacesLower.length() - 1; i++) {
            char temp = textWithoutSpacesLower.charAt(i);
            switch (temp) {
                case 'a':
                    letterNumbers[0] = letterNumbers[0] + 1;
                    break;
                case 'b':
                    letterNumbers[1] = letterNumbers[1] + 1;
                    break;
                case 'c':
                    letterNumbers[2] = letterNumbers[2] + 1;
                    break;
                case 'd':
                    letterNumbers[3] = letterNumbers[3] + 1;
                    break;
                case 'e':
                    letterNumbers[4] = letterNumbers[4] + 1;
                    break;
                case 'f':
                    letterNumbers[5] = letterNumbers[5] + 1;
                    break;
                case 'g':
                    letterNumbers[6] = letterNumbers[6] + 1;
                    break;
                case 'h':
                    letterNumbers[7] = letterNumbers[7] + 1;
                    break;
                case 'i':
                    letterNumbers[8] = letterNumbers[8] + 1;
                    break;
                case 'j':
                    letterNumbers[9] = letterNumbers[9] + 1;
                    break;
                case 'k':
                    letterNumbers[10] = letterNumbers[10] + 1;
                    break;
                case 'l':
                    letterNumbers[11] = letterNumbers[11] + 1;
                    break;
                case 'm':
                    letterNumbers[12] = letterNumbers[12] + 1;
                    break;
                case 'n':
                    letterNumbers[13] = letterNumbers[13] + 1;
                    break;
                case 'o':
                    letterNumbers[14] = letterNumbers[14] + 1;
                    break;
                case 'p':
                    letterNumbers[15] = letterNumbers[15] + 1;
                    break;
                case 'q':
                    letterNumbers[16] = letterNumbers[16] + 1;
                    break;
                case 'r':
                    letterNumbers[17] = letterNumbers[17] + 1;
                    break;
                case 's':
                    letterNumbers[18] = letterNumbers[18] + 1;
                    break;
                case 't':
                    letterNumbers[19] = letterNumbers[19] + 1;
                    break;
                case 'u':
                    letterNumbers[20] = letterNumbers[20] + 1;
                    break;
                case 'v':
                    letterNumbers[21] = letterNumbers[21] + 1;
                    break;
                case 'w':
                    letterNumbers[22] = letterNumbers[22] + 1;
                    break;
                case 'x':
                    letterNumbers[23] = letterNumbers[23] + 1;
                    break;
                case 'y':
                    letterNumbers[24] = letterNumbers[24] + 1;
                    break;
                case 'z':
                    letterNumbers[25] = letterNumbers[25] + 1;
                    break;
                default:
                    break;
            }
        }

        int valueOfRepetion = 0;
        for (int j = 0; j <= letterNumbers.length - 1; j++) {
            if (letterNumbers[j] > biggerRepetion) {
                valueOfRepetion = letterNumbers[j];
                biggerRepetion = letterNumbers[j];
                position = j;
                largestRepeatedLetter = letters[position];
            }

        }
        System.out.println(" ' "+largestRepeatedLetter+" ' was repeated "+ valueOfRepetion+" times");
    }

}
