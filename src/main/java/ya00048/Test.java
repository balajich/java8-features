package ya00048;

import java.util.Arrays;

class A<T>{
    void show(T t){
        System.out.println(t);

    }
}

class B<U,V>{
    U u;
    U show(V v){
        return u;
    }
}
class C<T>{
    T t;
    T hello(){
        return t;
    }
}
class D{
    <T> T hello(T t){
        return t;
    }
}
public class Test {
    public static void main(String[] args) {
        Arrays.asList(1,2,3);
    }
}

