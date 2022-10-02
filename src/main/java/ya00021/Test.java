package ya00021;

public class Test {
    //var name = "String"; // invalid

    public void sayHello() {
        var a = 2;
        //var a1=2,b1=2;//Invalid does not allow var in multiple variable declarations.
        //int a = 2, var b = 3; // Invalid
        //var c = null; // invalid
        //var d;  // invalid=> type inference is inferred on initialization of the variable
        // d = "Hello";
        var name = (String)null; //valid-since the type is provided !
    }
}
