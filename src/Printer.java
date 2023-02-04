public class Printer {
    IPrintStrategy printStrategy;

    public void print() {
        printStrategy.print();
    }
}
