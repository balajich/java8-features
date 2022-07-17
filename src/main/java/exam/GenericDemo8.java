package exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo8 {
    public static void main(String[] args) {
        List<? super IOException> ioList= new ArrayList<>();
        ioList.add(new IOException());
        ioList.add(new FileNotFoundException());
        ioList=new ArrayList<Exception>();



    }


}
