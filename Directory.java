package mockDirect;

import java.util.ArrayList;
/** main class **/
public class Directory extends Employee{

    public static void main(String[] args) {

        //creating three Address objects
        Address home1 = new Address ("10 FakeHome Street", "Staged City", "VA", "22222");
        Address home2 = new Address ("20 Staged Home Road", "Dummy", "VA","33333-1234");
        Address home3 = new Address ("401 West Main Street", "Richmond", "VA","23284-3019");

        Person sam = new Person();
        System.out.println(sam);

        //creating multiple Person objects
        Student student1 = new Student("Peter", null,"Luong", home1,
                "858-789-8575", "fake0@mymail.vcu.edu", "Freshman");

        Student student2 = new Student("Alice", null, "Myers", home1,
                "858-789-8576", "fake1@mymail.vcu.edu", "Senior");

        Faculty faculty1 = new Faculty ("Maria", "L", "Garcia", home3,
                "804-828-8577", "fake2@vcu.edu","323KL", 60000, 10, 10, 2010,
                "Associate Professor");

        Faculty faculty2 = new Faculty ("Michael", "Junior", "Cook", home3,
                "804-789-8578", "fake3@vcu.edu","356JL", 50000, 05, 05, 2015,
                "Instructor");

        Staff staff1 = new Staff("Shane", null, "Dave", home2,
                "858-789-8579", "fake4@vcu.edu","356JL", 40000, 8, 8, 2008,
                "Professor");

        Employee employee = new Employee("Shane", null, "Dave", home2,
                "858-789-8579", "fake4@vcu.edu","356JL", 40000, 8, 8, 2008);

        //adding the above created objects to the arraylist dataBase
        ArrayList<Person> dataBase = new ArrayList<>();
        dataBase.add(student1);
        dataBase.add(student2);
        dataBase.add(faculty1);
        dataBase.add(faculty2);
        dataBase.add(staff1);
        dataBase.add(employee);

        //iterating through the arraylist dataBase to call toString() method of each object
        for (int i=0; i<dataBase.size(); i++)
            System.out.println(dataBase.get(i));
    }
}