public class MonochromePrinter extends Printer{
   public MonochromePrinter() {
       this.printStrategy = new MonoPrintStrategy();
   }
}
