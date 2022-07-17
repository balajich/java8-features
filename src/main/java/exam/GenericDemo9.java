package exam;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenericDemo9 {
    static class A{

    }
    static  class B extends  A{

    }
    static  class C extends B{

    }
    public static void main(String[] args) {
        List<? super A> aList= new ArrayList<A>();
        aList.add(new A());
        aList.add(new B());
        aList.add(new C());

        List<? extends A> bList= new ArrayList<>();












    }


}
