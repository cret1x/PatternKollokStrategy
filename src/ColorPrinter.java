public class ColorPrinter extends Printer{
    public ColorPrinter() {
        this.printStrategy = new ColorPrintStrategy();
    }
}
