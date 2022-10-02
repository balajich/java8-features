package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentException {
    public static void main(String[] args) {
        List<Integer> elements = List.of(1, 2, 3, 4);
        //elements.remove(0); Unmodifiable list
        //elements= new ArrayList<>(elements);

        //CopyOnWriteArrayList<Integer> copy1 = new CopyOnWriteArrayList<Integer>(elements);
        //ArrayList<Integer> copy1 = new ArrayList<>(elements); //Throws Exception
        //List<Integer> copy1 = Collections.synchronizedList(new ArrayList<>(elements)); //Throws Exception
        ConcurrentLinkedQueue<Integer> copy1 = new ConcurrentLinkedQueue<Integer>(elements); //Throws Exception
        for(Integer element:copy1){
            copy1.remove(element);
            System.out.println(copy1);
        }


    }
}
