package exam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo114 {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException io) {
            System.out.println(io);
        } catch (IOException io) {
            System.out.println(io);
        }
    }
}
