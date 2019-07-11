package features.lambda.interfaces;

public class Demo01SimpleInterface {


    public static void main(String[] args) {
        Hello hello = new DisplayHello();
        hello.helloMessage();
        hello = new PrinterHello();
        hello.helloMessage();
    }
}

interface Hello {
    void helloMessage();
}

class DisplayHello implements Hello {
    @Override
    public void helloMessage() {
        System.out.println("Hello World on  Monitor");
    }
}

class PrinterHello implements Hello {
    @Override
    public void helloMessage() {
        System.out.println("Hello World on  Printer");
    }
}