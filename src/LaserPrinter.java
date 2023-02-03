public class LaserPrinter implements IPrinter{
    @Override
    public void Print() {
        System.out.println("Printing on LaserPrinter");
    }

    @Override
    public int GetInkLevel() {
        return 1337;
    }

    @Override
    public void SetPrintParams(String params) {

    }
}
