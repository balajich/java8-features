package exam.p1;

public class A {
    private  int iPrivate;
    protected int jProtected;
    public int kPublic;
    int lDefault;
}
class B extends A{
    public void hello(){
        System.out.println(jProtected);
        System.out.println(kPublic);
        System.out.println(lDefault);
    }
}

class Unreleated{
    public void hello(){
        A a= new A();
        System.out.println(a.jProtected);
        System.out.println(a.kPublic);
        System.out.println(a.lDefault);
    }
}