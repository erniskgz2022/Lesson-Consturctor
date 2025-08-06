package task1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yellow", "Alabay",2);
        Dog dog1 = new Dog();
        dog1.color = "Whith";
        dog1.breed = "Domoshniy";
        dog1.age = 5;
        Cat cat = new Cat("Gri","munchkin",1);
        Cat cat1 = new Cat();
        cat1.color = "Black";
        cat1.breed = "Burma";
        cat1.age = 3;

        System.out.println("Color: " + dog1.color + "\n" +
                "Breed: " + dog.breed + "\n" +
                "Age: " + dog.age);
        System.out.println();
        System.out.println("Color: " + dog1.color + "\n" +
                "Breed: " + dog1.breed + "\n" +
                "Age: " + dog1.age);
        System.out.println();
        System.out.println("Color: " + cat.color + "\n" +
                "Breed: " + cat.breed + "\n" +
                "Age: " + cat.age);
        System.out.println();
        System.out.println("Color: " + cat1.color + "\n" +
                "Breed: " + cat1.breed + "\n" +
                "Age: " + cat1.age);
    }
}