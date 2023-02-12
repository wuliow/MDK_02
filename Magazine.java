public class Magazine implements Printable{

    private final String s;

    public Magazine(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void print() {
        System.out.println(getS());
    }

    static void printMagazines(Printable[] printable){
        for (Printable q: printable){
            if (q instanceof Magazine){
                q.print();
            }
        }
    }
}