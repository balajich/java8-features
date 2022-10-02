package exam;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo113 {
    public static void main(String[] args) {
        try
        {
            throw new FileNotFoundException();
        }catch(IOException io){
            System.out.println(io);
        }/*catch(FileNotFoundException io){
            System.out.println(io);
        }*/
    }
}
