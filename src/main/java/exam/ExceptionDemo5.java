package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo5 {
    //Checked exception demo
    public static void main(String[] args) throws FileNotFoundException {
        File file= new File("abc.txt");
        System.out.println(file.exists());
        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }
}
