package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo116 {
    static class MyException extends Exception {
        public MyException() {
            super();
        }

        public MyException(Exception e) {
            super(e);
        }

        public MyException(String e) {
            super(e);
        }

    }

    public static void main(String[] args) throws MyException {
        throw new MyException();
    }

}

