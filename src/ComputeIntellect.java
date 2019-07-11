public class ComputeIntellect {

    int doctorate;
    int highSchool;
    int postgraduate;
    int undergraduate;
    static final int HIGHSCHOOL = 1;
    static final int UNDERGRADUATE = 2;
    static final int POSTGRADUATE = 3;
    static final int DOCTORATE = 4;


    public void distributionOfQualification(Citizen[] citizens) {
        doctorate = 0;
        highSchool = 0;
        postgraduate = 0;
        undergraduate = 0;
        for (Citizen citizen: citizens) {

            System.out.println("Citizen with id: " + citizen.citizenID + " is " + Citizen.convert(citizen.educationQualification));

            if (citizen.educationQualification == HIGHSCHOOL) {
                highSchool++;
            }
            if (citizen.educationQualification == UNDERGRADUATE) {
                undergraduate++;
            }
            if (citizen.educationQualification == POSTGRADUATE) {
                postgraduate++;
            }
            if (citizen.educationQualification == DOCTORATE) {
                doctorate++;
            }

            System.out.println("HIGHSCHOOL: " + highSchool);
            System.out.println("UNDERGRADUATE: " + undergraduate);
            System.out.println("POSTGRADUATE: " + postgraduate);
            System.out.println("DOCTORATE: " + doctorate);
        }


    }
}
