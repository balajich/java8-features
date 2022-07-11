package exam;

public class ScopeDemo1 {
    int i;
    char c;
    public void ScopeDemo1(){
        System.out.println("This is not constructor");
    }
    public void flow(){
        System.out.println(i);
        System.out.println(c);
    }
    public static void main(String[] args) {
        ScopeDemo1 scopeDemo1= new ScopeDemo1();
        scopeDemo1.flow();
        scopeDemo1.ScopeDemo1();
    }
}
