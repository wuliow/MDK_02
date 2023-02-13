public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Python для начинающих");
        Book book2 = new Book("Основы C#");

        Magazine magazine1 = new Magazine("Мерч Энтони");
        Magazine magazine2 = new Magazine("Мерч Ноуки");

        Printable[] printables = {book1, book2, magazine1, magazine2};

        for(Printable s: printables) {
            s.print();
        }

        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}