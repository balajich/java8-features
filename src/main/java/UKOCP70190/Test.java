package UKOCP70190;
interface Creator<T>
{
    T create(String type);
}
enum AnimalType{
    MAMMAL,BIRD,REPTILE;
}
abstract class Animal{
    private AnimalType type;
    public Animal(AnimalType type){
        this.type=type;
    }
    public AnimalType getType(){
        return type;
    }
}
class Dog extends Animal{
    public Dog(String type){
        super(AnimalType.valueOf(type.toUpperCase()));
    }
}
public class Test {
    public static void main(String[] args) {
        Creator<Animal> obj=Dog::new;
        var d=obj.create("mammal");
        System.out.println(d.getType());
    }
}
