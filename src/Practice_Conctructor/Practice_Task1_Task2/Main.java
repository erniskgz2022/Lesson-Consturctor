package Practice_Conctructor.Practice_Task1_Task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Baisal", LocalDate.of(2003,6,6),0555112233,"Kyrgyz");
        Student student2 = new Student("Akjol",LocalDate.of(1999,2,1),0555445566,"Turkey");
        Student student3 = new Student("Jekson",LocalDate.of(2000,5,7),0555112233,"USA");
        Student student4 = new Student("Mert Adam",LocalDate.of(1998,3,9),0545552266,"Kazak");
        Student student5 = new Student("Timur",LocalDate.of(1995,2,1),0555112233,"Kyrgyz");
        
        Student[] students = {student1,student2,student3,student4,student5};
        for (Student std : students) {
            std.getInfo();
            System.out.println("Age: " + std.getAge());
        }
    }
}
