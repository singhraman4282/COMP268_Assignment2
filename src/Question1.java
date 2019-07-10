public class Question1 {

    private static char[][] chars = new char[3][80];

    public static void main(String[] args) {

        String firstSentence = truncataSentence("The first sentence should be loaded into the first row in the reverse order of characters");
        firstSentence = reverseByCharacters(firstSentence);

//        for (int i=0; i<3; i++) {
//            char[] c = new char[80];
//            for (int j=0; j<80; j++) {
//                c[j] = firstSentence.charAt(j);
//            }
//            chars[i] = c;
//        }

        String secondSentence = reverseByWords("The first sentence should be loaded into the first row in the reverse order of characters");
        String thirdSentence =  change5thPosition("The first sentence should be loaded into the first row in the reverse order of characters");

        char[] c1 = new char[80];
        char[] c2 = new char[80];
        char[] c3 = new char[80];

        for (int j=0; j<80; j++) {
            c1[j] = firstSentence.charAt(j);
        }

        for (int j=0; j<80; j++) {
            c2[j] = secondSentence.charAt(j);
        }

        for (int j=0; j<80; j++) {
            c3[j] = thirdSentence.charAt(j);
        }


        chars[0] = c1;
        chars[1] = c2;
        chars[2] = c3;



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
            System.out.println(c);
            for (int j=0; j<80; j++) {
                matrix = matrix + "|" + c[j];
            }
            matrix = matrix + "\n";
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
        for (int i=0; i<80;i++) {
            char c = s.charAt(i);
            truncated = truncated + c;
        }
        return truncated;
    }


}
