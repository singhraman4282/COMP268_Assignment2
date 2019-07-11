public class Village {

    Citizen[] citizens;
    int pointer;
    private int numberOfCitizens;

    public int getNumberOfCitizens() {
        return numberOfCitizens;
    }

    public Village() {
        numberOfCitizens = 100;
        citizens = new Citizen[numberOfCitizens];
    }

    public void addCitizen(int qual) {
        int id = Citizen.generateID();
        Citizen citizen = new Citizen(id, qual);
        citizens[id - 1] = citizen;
    }

    public void addCitizen() {
        int qual = Citizen.generateEducationalQualification();
        addCitizen(qual);
    }

}
