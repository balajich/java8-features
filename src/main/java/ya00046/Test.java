package ya00046;

class Vehicle implements Mobile {

    public static void main(String[] args) {
        Truck theTruck = new Truck();
        Vehicle theVehicle = theTruck;
        Mobile theMobile = theVehicle;
    }
}

class Truck extends Vehicle {
}

interface Mobile {
}
interface Movable{
    private void  move(int x){
        System.out.println("Moving by "+x+" points");
    }
}
public class Test {
    public static void main(String[] args) {

    }
}

