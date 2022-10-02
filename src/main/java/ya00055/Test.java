package ya00055;

import java.io.FileReader;
import java.io.IOException;

import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter(System.out)) {
            writer.println("Hello");
        } catch(Exception ex) {
         ex.printStackTrace();
        }
    }
}