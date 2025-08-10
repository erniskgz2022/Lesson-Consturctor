package Lesson_Constructor.task2;

public class Course {

    String name;
    String instructorName;
    Student [] students;

    public Course(){

    }

    public  Course(String name, String instructorName, Student [] students){
        if (name.length() <=2){
            System.out.println("Atyny tuura jazynyz!");
            this.name = null;
        }else {
            this.name = name;
        }

        this.instructorName = instructorName;
        this.students = students;
    }
    public void getInfo (){
        System.out.println("Name: " + name + "\n" +
                "InstructorName:: " + instructorName
                 );
    }

}
