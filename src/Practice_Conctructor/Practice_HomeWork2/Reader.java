package Practice_Conctructor.Practice_HomeWork2;

import java.time.LocalDate;

public class Reader {
    String fullName;
    String library;
    int cardNumber;
    LocalDate dateOfBirth;
    String phoneNumber;

    public Reader () {}

    public Reader (String fullName, String library, int cardNumber, LocalDate dateOfBirth, String phoneNumber){
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth =dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void  takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void returBook(int count){
        System.out.println(fullName + " вернул " + count + " книги.");
    }
}
