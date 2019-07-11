package features.lambda;


public class Demo13SimpleLambdaHelloWorldWithOneParamter {
    interface Message {
        String showMessage(String message);
    }

    public static void main(String[] args) {

        Message myMessage = (message) -> message;
        System.out.println(myMessage.showMessage("Hello World"));

        // This is also fine
        Message myMessage1 = (String message) -> message;
        System.out.println(myMessage1.showMessage("Hello World"));

    }
}

