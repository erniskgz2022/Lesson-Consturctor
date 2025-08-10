package Lesson_Constructor.HomeWork;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("ERNIS","TURGUNBAI UULU",24);
        MyClass myClass1 = new MyClass(new String[]{"Java", "Spring","Git","Database"}, "Плов");

        myClass.getInfo();
        myClass1.getInfo2();
    }
}
