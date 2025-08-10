package Lesson_Constructor.task2;

public class Student {

    String name;
    int age;
    int typing;

    public Student() {

    }

    public Student (String name, int age,int typing){
        this.name = name;
        if ( age < 16){
            System.out.println(name + "okuuga munkunchuluugu jok");
        }else {
            this.age = age;
        }

        this.typing = typing;
    }

    public void getInfo(){
        System.out.println("Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Typing: " + typing );
    }

}
