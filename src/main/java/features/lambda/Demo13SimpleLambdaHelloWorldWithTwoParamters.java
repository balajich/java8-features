package features.lambda;


public class Demo13SimpleLambdaHelloWorldWithTwoParamters {
    interface Message {
        String showMessage(String from, String message);
    }

    public static void main(String[] args) {

        Message myMessage = (from, message) -> from + ": " + message;
        System.out.println(myMessage.showMessage("Jack", "Hello World"));

    }
}

