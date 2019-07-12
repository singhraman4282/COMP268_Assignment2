/*
Create a Person class that includes the name of the person, the weight of the person (in
pounds), and the height of the person (in inches). For the data listed in the table below, create four
Person objects. Compute their individual body mass index (BMI) and store it as part of these
objects. Further, determine their weight category (see below) and add that information as part of
the object as well. Store each of these four Person objects, their corresponding BMI, and weight
category in a different ArrayList and develop get and set methods to access elements in that
ArrayList.

Name Weight (pounds) Height (inches)
Andrew 125.5 55.1
Boyd 150.0 67
Cathy 135 72.3
 */

import java.util.ArrayList;

public class Question7 {

    public static void main(String[] args) {
        Person andrew = new Person(55.1, 125.5, "Andrew");
        Person boyd = new Person(67,150,"Boyd");
        Person cathy = new Person(72.3,135, "Cathy");
        Person donna = new Person(64, 190, "Donna");

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(andrew);
        people.add(boyd);
        people.add(cathy);
        people.add(donna);

        for (Person person: people) {
            person.setBmi(person.getBmi());
            person.setCategory(person.getCategory());
            System.out.println(person.getName() + "-> BMI: " + person.getBmi() + ", " + person.getCategory());
        }


    }
}
