package Lesson_Constructor.task3;

public class Contest {
    int id;
    String name;
    String category;
    String date;


    public Contest () {

    }

    public Contest (int id, String name){
        this.id = id;
        this.name = name;
    }

    public Contest(int id, String name, String category){
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Contest(int id, String name, String category,String date){
        this.id = id;
        this.name = name;
        this.category = category;
        this.date = date;
    }
// Категория жана датасы менен (мисалы, курамы жок уюштурулуп жаткан конкурс)
    public Contest (String category, String date){
        this.category = category;
        this.date = date;
    }

    public void getInfo (){
        System.out.println("ID: " + id);
        System.out.println("Аты: " + name);
        System.out.println("Категориясы: " + category);
        System.out.println("Дата: " + date);
    }




}
