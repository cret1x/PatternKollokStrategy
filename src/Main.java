public class Main {
    public static void main(String[] args) {
        IPrinter[] printers = new IPrinter[2];
        printers[0] = new JetPrinter();
        printers[1] = new LaserPrinter();

        for (var printer: printers) {
            System.out.println(printer.getInkLevel());
            printer.print();
        }
    }
}