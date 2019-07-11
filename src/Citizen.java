public class Citizen {
    int citizenID;
    int educationQualification;
    static final int HIGHSCHOOL = 1;
    static final int UNDERGRADUATE = 2;
    static final int POSTGRADUATE = 3;
    static final int DOCTORATE = 4;
    static int id;

    public Citizen(int id, int qual) {
        this.citizenID = id;
        this.educationQualification = qual;
    }

    public static int generateEducationalQualification() {
        return (int)(Math.random() * 4) + 1;
    }

    public static int generateID() {
        int generatedID = Citizen.id + 1;
        Citizen.id = generatedID;
        return generatedID;
    }

    public static String convert(int i) {
        String[] quals = {"HIGHSCHOOL", "UNDERGRADUATE", "POSTGRADUATE", "DOCTORATE"};
        if (i <= 4) {
            return quals[i - 1];
        }
        return "HIGHSCHOOL";
    }

    public static void resetID() {
        Citizen.id = 0;
    }

}
