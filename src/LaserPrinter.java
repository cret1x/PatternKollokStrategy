public class LaserPrinter implements IPrinter{
    @Override
    public void print() {
        System.out.println("Printing on LaserPrinter");
    }

    @Override
    public int getInkLevel() {
        return 1337;
    }

    @Override
    public void setPrintParams(String params) {

    }
}
