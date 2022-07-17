package exam;

import java.util.List;

public class GenericDemo4 {
    static class DotMatrixPrinters<T>{
        T[] printers;
        public DotMatrixPrinters(T[] printers){
            this.printers=printers;
        }
        public void print(){
            for(T t:printers){
                System.out.println(t);
            }
        }
    }
    public static void main(String[] args) {
       // DotMatrixPrinters<String[]>  dotMatrixPrinters= new DotMatrixPrinters<>(new String[]{"EPSON","CATOSARA"});


    }
}
