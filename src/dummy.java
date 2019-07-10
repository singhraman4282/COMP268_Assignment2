public class dummy {
    public static void main(String[] args) {
        String s = "Raman";


        int difference = 10 - s.length();
        for (int i=0; i<difference; i++) {
            s = s + "s";
        }

        System.out.println(s);

    }
}
