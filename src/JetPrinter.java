public class JetPrinter implements IPrinter{

    @Override
    public void print() {
        System.out.println("Printing on JetPrinter");
    }

    @Override
    public int getInkLevel() {
        return 42;
    }

    @Override
    public void setPrintParams(String params) {
    }

    public JetPrinter() {

    }
}
