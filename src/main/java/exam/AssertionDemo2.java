package exam;

public class AssertionDemo2 {
    public static void main(String[] args) {
        assert 1 == 1;
        assert 2==2:"Problem with Assertions";
        assert "a".equals("b"):"equals check failed";
    }
}
