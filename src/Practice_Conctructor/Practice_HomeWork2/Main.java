package Practice_Conctructor.Practice_HomeWork2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader(
                "Петров В. В.",
                "Central Library",
                12345,
                LocalDate.of(2022,6,25),
                "+996 555 123 456"
        );

        reader1.takeBook(3);
        reader1.returBook(3);
    }
}
