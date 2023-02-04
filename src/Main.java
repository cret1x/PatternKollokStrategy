public class Main {
    public static void main(String[] args) {
        Printer[] printers = new Printer[2];
        printers[0] = new ColorPrinter();
        printers[1] = new MonochromePrinter();
        printers[0].print();
        printers[1].print();
    }
}