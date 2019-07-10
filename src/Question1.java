/*
Read three sentences from the console application. Each sentence should not exceed 80
characters. Then, copy each character in each input sentence in a [3 x 80] character array.
The first sentence should be loaded into the first row in the reverse order of characters – for
example, “mary had a little lamb” should be loaded into the array as “bmal elttil a dah yram”.
The second sentence should be loaded into the second row in the reverse order of words – for
example, “mary had a little lamb” should be loaded into the array as “lamb little a had mary”.
The third sentence should be loaded into the third row where if the index of the array is divisible by
5, then the corresponding character is replaced by the letter ‘z’ – for example, “mary had a little
lamb” should be loaded into the array as “mary zad azlittze lazb” – that is, characters in index
positions 5, 10, 15, and 20 were replaced by ‘z’.
Note that an empty space is also a character, and that the index starts from position 0. Now print
the contents of the character array on the console.
 */

import java.util.Scanner;

public class Question1 {

    private static char[][] chars = new char[3][80];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first sentence");
        String s1 = scanner.nextLine();
        s1 = truncataSentence(s1);
        s1 = reverseByCharacters(s1);

        System.out.println("Please enter second sentence");
        String s2 = scanner.nextLine();
        s2 = truncataSentence(s2);
        s2 = reverseByWords(s2);

        System.out.println("Please enter third sentence");
        String s3 = scanner.nextLine();
        s3 = truncataSentence(s3);
        s3 = change5thPosition(s3);


        char[] row1 = new char[80];
        char[] row2 = new char[80];
        char[] row3 = new char[80];


        for (int i=0; i<80; i++) {
            row1[i] = s1.charAt(i);
            row2[i] = s2.charAt(i);
            row3[i] = s3.charAt(i);
        }

        chars[0] = row1;
        chars[1] = row2;
        chars[2] = row3;

        System.out.println(printChar2DArray(chars));

    }


    public static String change5thPosition(String s) {
        String changed = "";
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if ((i%5 == 0) && (i>0)) {
                c = 'z';
            }
            changed = changed + c;
        }
        return changed;
    }

    public static String printChar2DArray(char[][] arr) {

        String matrix = "";

        for (int i=0; i<arr.length; i++) {
            char[] c = arr[i];
            for (int j=0; j<80; j++) {
                matrix = matrix + "|" + c[j];
            }
            matrix = matrix + "|\n";
        }



        return matrix;
    }

    public static String reverseByCharacters(String s) {
        String reversed = "";
        for (int i=s.length() - 1;i>=0;i--) {
            char c = s.charAt(i);
            reversed = reversed + c;
        }

        return reversed;
    }

    public static String reverseByWords(String s) {
        String reversed = "";
        String word = "";
        for (int i=0; i<s.length();i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                word = word + c;
            } else {
                reversed = word + " " + reversed;
                word = "";
            }
            // We reached end of sentence
            if (i == s.length() - 1) {
                reversed = word + " " + reversed;
            }
        }


        return reversed;
    }

    public static String truncataSentence(String s) {
        String truncated = "";
        if (s.length() >= 80) {
            for (int i=0; i<80;i++) {
                char c = s.charAt(i);
                truncated = truncated + c;
            }
        } else {
            int difference = 80 - s.length();
            truncated = s;
            for (int i=0; i<difference; i++) {
                truncated = truncated + " ";
            }
        }

        return truncated;
    }


}
