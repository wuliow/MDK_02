public class Book implements Printable{
    
    private final String s;

    public Book(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void print() {
        System.out.println(getS());
    }
    static void printBooks(Printable[] printable){
        for (Printable q: printable){
            if (q instanceof Book){
                q.print();
            }
        }
    }
}