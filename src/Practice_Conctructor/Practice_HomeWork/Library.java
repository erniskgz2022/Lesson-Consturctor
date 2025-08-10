package Practice_Conctructor.Practice_HomeWork;

public class Library {
    int id;
    String name;
    String address;
    Book [] books;


    public Library () {

    }

    public Library (int id, String name, String address, Book [] books) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.books = books;
    }

    public void displayBooks() {
        System.out.println("\nLibrary: " + name + " (" + address + ")");
        for (Book b : books) {
            b.getInfo();
        }
    }
}
