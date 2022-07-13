package exam;

public class InnerClassDemo {
    private interface Printer{
        void print();
    }
    private class LinePrinter implements  Printer{

        @Override
        public void print() {
            System.out.println("This is a line printer");
        }
    }
    public void printText(){
        Printer printer= new LinePrinter();
        printer.print();
    }

    public static void main(String[] args) {
        InnerClassDemo innerClassDemo= new InnerClassDemo();
        innerClassDemo.printText();
    }
}
