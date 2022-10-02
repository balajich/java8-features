package exam;

import java.io.IOException;

public class ExceptionDemo111 {
    public static void main(String[] args) {
        try
        {
            throw new IOException();
        }catch(IOException io){
            System.out.println(io);
        }
    }
}
