package Practice_Conctructor.Practice_Task4;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mert", 25,"Backend",50000,"Apple 16 pro");
        Person person2 = new Person("Akyl", 22,"Fontend",30000,"Apple 15 pro");
        Person person3 = new Person("BEka", 21,"Full Stack",70000,"Apple 14 pro");
        Person person4 = new Person("Sama", 20,"Analitik",10000,"Apple 13 pro");
        Person person5 = new Person("Kema", 18,"Database",80000,"Apple 12 pro");

        Person [] persons = {person1,person2,person3,person4,person5};
        System.out.println("-------------Information Persons------------");
        for (Person person : persons) {
            person.getInfo();
        }

        Person maxSalary = persons[0];
        Person minSalary = persons[0];
        for (Person person : persons) {

            if (person.salary > maxSalary.salary){
                maxSalary = person;
            }

            if (person.salary < minSalary.salary){
                minSalary = person;
            }

            
        }

        Person expensivePhone = persons[0];
        for (Person person : persons) {
            // Телефондогу санды бөлүп алабыз (мисалы, iPhone 16 Pro -> 16)
            String[] parts = person.phone.split(" ");
            int phoneNumber = Integer.parseInt(parts[1]);

            String[] maxParts = expensivePhone.phone.split(" ");
            int maxPhoneNumber = Integer.parseInt(maxParts[1]);

            if (phoneNumber > maxPhoneNumber) {
                expensivePhone = person;
            }
        }

        System.out.println("-----------Max Salary Person--------------");
        System.out.println("Name: " + maxSalary.name + "\nSalary: " + maxSalary.salary);
        System.out.println("-----------Min Salary Person--------------");
        System.out.println("Name: " + minSalary.name + "\nSalary: " + minSalary.salary);
        System.out.println("------Most Expensive Phone Owner------");
        System.out.println("Name: " + expensivePhone.name + " | Phone: " + expensivePhone.phone);
    }
}
