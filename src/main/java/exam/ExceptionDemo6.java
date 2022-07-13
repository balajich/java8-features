package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo6 {
    //Unchecked exception demo
    public static void main(String[] args) {
        int i = 1;
        if (i == 1)
            throw new RuntimeException("Invalid value");
    }
}
