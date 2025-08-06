package task2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Bekzat", 22,30);
        Student student2 = new Student("Arzy", 25,50);

        Student [] students = {student1,student2};
        Course course = new Course("Java","Aizat",students);
        course.getInfo();
        for (Student student : course.students) {
            student.getInfo();
        }
    }
}
