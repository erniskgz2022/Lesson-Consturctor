package Lesson_Constructor.task3;

public class Main {
    public static void main(String[] args) {
        Contest c1 = new Contest(1, "Спорт таймашы");
        Contest c2 = new Contest(2, "IT Хакатон", "Технология");
        Contest c3 = new Contest(3, "Арт Баттл", "Искусство", "2025-10-12");
        Contest c4 = new Contest("Маданият", "2025-11-01");

        c1.getInfo();
        System.out.println("---------------------");
        c2.getInfo();
        System.out.println("---------------------");
        c3.getInfo();
        System.out.println("---------------------");
        c4.getInfo();
        System.out.println("---------------------");

    }
}
