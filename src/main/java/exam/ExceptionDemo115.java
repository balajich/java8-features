package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo115 {
    public static void main(String[] args) {
       try(var in= new FileInputStream("a");var out=new FileOutputStream("o")){

       }catch (IOException ioe){
           System.out.println(ioe);
       }
    }
}
