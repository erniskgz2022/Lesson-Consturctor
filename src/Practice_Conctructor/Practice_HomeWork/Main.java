package Practice_Conctructor.Practice_HomeWork;

public class Main {
    public static void main(String[] args) {
        Book[] books1 = {
                new Book(1, "Java Basics", 500, "Programming", "2024-01-01"),
                new Book(2, "Python 101", 450, "Programming", "2024-02-01"),
                new Book(3, "C# Guide", 550, "Programming", "2024-03-01"),
                new Book(4, "JS Mastery", 400, "Web Dev", "2024-04-01"),
                new Book(5, "HTML & CSS", 300, "Web Dev", "2024-05-01")
        };

        Book[] books2 = {
                new Book(6, "History 1", 200, "History", "2023-01-01"),
                new Book(7, "History 2", 250, "History", "2023-02-01"),
                new Book(8, "History 3", 300, "History", "2023-03-01"),
                new Book(9, "History 4", 350, "History", "2023-04-01"),
                new Book(10, "History 5", 400, "History", "2023-05-01")
        };

        Book[] books3 = {
                new Book(11, "Math 1", 150, "Math", "2022-01-01"),
                new Book(12, "Math 2", 170, "Math", "2022-02-01"),
                new Book(13, "Math 3", 180, "Math", "2022-03-01"),
                new Book(14, "Math 4", 190, "Math", "2022-04-01"),
                new Book(15, "Math 5", 200, "Math", "2022-05-01")
        };

        Library lib1 = new Library(1, "Central Library", "Bishkek", books1);
        Library lib2 = new Library(2, "History Library", "Osh", books2);
        Library lib3 = new Library(3, "Math Library", "Karakol", books3);

        Library[] libraries = { lib1, lib2, lib3 };

        for (Library lib : libraries) {
            if (lib.id == 1) {
                lib.displayBooks();
                break;
            }
        }
    }
}
