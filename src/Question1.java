public class Question1 {

    public static void main(String[] args) {

        String truncatesd = reverseByWords("The first sentence should be loaded into the first");
        System.out.println(truncatesd);
    }

    public static String change5thPosition(String s) {
        return "";
    }

    public static String printChar2DArray(char[][] arr) {
        return "";
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
