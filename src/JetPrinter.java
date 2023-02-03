public class JetPrinter implements IPrinter{

    @Override
    public void Print() {
        System.out.println("Printing on JetPrinter");
    }

    @Override
    public int GetInkLevel() {
        return 42;
    }

    @Override
    public void SetPrintParams(String params) {
    }

    public JetPrinter() {

    }
}
