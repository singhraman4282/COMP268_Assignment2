/*
 Name Weight (pounds) Height (inches)
Andrew 125.5 55.1
Boyd 150.0 67
Cathy 135 72.3

Create a Person class that includes the name of the person, the weight of the person (in
pounds), and the height of the person (in inches). For the data listed in the table below, create four
Person objects. Compute their individual body mass index (BMI) and store it as part of these
objects. Further, determine their weight category (see below) and add that information as part of
the object as well. Store each of these four Person objects, their corresponding BMI, and weight
category in a different ArrayList and develop get and set methods to access elements in that
ArrayList.

BMI can indicate the following categories:
• Underweight when BMI is less than 18.5
• Normal weight when BMI is between 18.5 and 25
• Overweight when BMI is between 25 and 30
• Obese when BMI is 30 or greater
 */

public class Person {
    private double bmi;
    private double height;
    private double weight;
    private String category;
    private String name;

    public double getBmi() {
        return (weight * 703)/(height * height);
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getCategory() {
        return getCategory(getBmi());
    }

    public String getName() {
        return name;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Person(double height, double weight, String name) {
        this.height = height;
        this.weight = weight;
        this.name = name;
    }

    public String getCategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";

        if (bmi < 25)
            return "Normal";

        if (bmi < 30)
            return "Overweight";


        return "Obese";
    }
}
