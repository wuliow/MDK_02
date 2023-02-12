public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("как выучить java за пять минут");
        Book book2 = new Book("учебное пособие: как не получить двойку");

        Magazine magazine1 = new Magazine("как сохранить нервы");
        Magazine magazine2 = new Magazine("все умные слова программистов - просто, четко, ясно");

        Printable[] printables = {book1, book2, magazine1, magazine2};

        for(Printable s: printables) {
            s.print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}