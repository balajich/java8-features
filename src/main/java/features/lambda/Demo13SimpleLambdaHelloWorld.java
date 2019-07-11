package features.lambda;

interface Message {
    String showMessage();
}

public class Demo13SimpleLambdaHelloWorld {
    public static void main(String[] args) {

        Message myMessage = () -> "Hello World";
        System.out.println(myMessage.showMessage());

    }
}

