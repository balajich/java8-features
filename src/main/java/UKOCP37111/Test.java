package UKOCP37111;

interface Creator<T, R> {
    R create(T t);
}
 
abstract class Animal {
    abstract void eat();
}
 
class Dog extends Animal {
    private String name;
    Dog(String name){
        this.name=name;
    }
    
    void eat() {
        System.out.println(this.name + " eats biscuits.");
    }
}
 
public class Test {
    public static void main(String[] args) {
        Creator<String, Animal> obj =  Dog::new; //Line n1
        obj.create("Cooper").eat(); //Line n2
    }
}