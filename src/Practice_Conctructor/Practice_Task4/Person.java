package Practice_Conctructor.Practice_Task4;

public class Person {
    String name;
    int age;
    String work;
    int salary;
    String phone;


    public Person () {

    }

    public  Person (String name, int age, String work, int salary, String phone ){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;
    }

    public void getInfo(){

        System.out.println("\nName: " + name + "\n" +
                "Age: " + age + "\n" +
                "Work: " + work + "\n" +
                "Salary: " + salary + "\n" +
                "Phone: " + phone + "\n");

    }

}


