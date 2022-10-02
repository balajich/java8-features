interface A{
    default  void hello(){
        System.out.println(" I am interface A default method");
    }
}
interface  B extends  A{
    //Allowed I can override default method to abstract method
    void hello();
}