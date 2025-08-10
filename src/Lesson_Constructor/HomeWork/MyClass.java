package Lesson_Constructor.HomeWork;

import java.util.Arrays;

public class MyClass {
    String name;
    String surname;
    int age;
    String [] lessons;
    String foods;

    public MyClass(){

    }

    public MyClass (String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MyClass (String  [] lessons, String foods){
        this.lessons = lessons;
        this.foods = foods;
    }

    public void getInfo(){
        System.out.println(
                "First Name: " + name + "\n" +
                "SurName: " + surname + "\n" +
                "Age: " + age
        );

    }
    public void getInfo2(){
        System.out.println(
                        "Lessons : " + Arrays.toString(lessons) + "\n" +
                        "Foods: " + foods
        );

    }

}

