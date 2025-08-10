package Practice_Conctructor.Practice_HomeWork;


public class Book {
    int id;
    String bookName;
    float price;
    String genre;
    String createDate;

    public Book () {

    }

    public Book (int id, String bookName, float price, String genre, String createDate) {
            this.id = id;
            this.bookName = bookName;
            this.price = price;
            this.genre = genre;
            this.createDate = createDate;
    }

    public void getInfo() {
        System.out.println("Book ID: " + id);
        System.out.println("Name: " + bookName);
        System.out.println("Price: " + price);
        System.out.println("Genre: " + genre);
        System.out.println("Create Date: " + createDate);
        System.out.println("--------------------------------");
    }

}
