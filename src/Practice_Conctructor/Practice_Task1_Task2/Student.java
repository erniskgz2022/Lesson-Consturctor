package Practice_Conctructor.Practice_Task1_Task2;

import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBrith;
    int phoneNumber;
    String nationality;

    public Student(){}

    public  Student (String name,  LocalDate dateOfBrith, int phoneNumber, String nationality){
        this.name = name;
        this.dateOfBrith = dateOfBrith;
        this.phoneNumber = phoneNumber;
        this.nationality = nationality;
    }

    public int getAge() {
       return 2025 - this.dateOfBrith.getYear();
    }

    public void getInfo(){
        System.out.println(
                         "\nName: "  + name + "\n" +
                        "Date Of Brith: " + dateOfBrith + "\n" +
                        "Phone Number: " + phoneNumber + "\n" +
                        "Nationality: " + nationality
        );
    }
}
