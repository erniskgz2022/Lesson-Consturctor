package Practice_Conctructor.Practice_Task3;

import java.time.LocalDate;

public class Person {
    String firstName;
    String LastName;
    LocalDate dataOfBirth;

    public Person () {

    }
    public  Person (String firstName, String lastName, LocalDate dataOfBirth){
        this.firstName = firstName;
        this.LastName = lastName;
        this.dataOfBirth = dataOfBirth;
    }
}
