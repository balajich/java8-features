class LambasDemo3{
    int i,j,k;
    LambasDemo3(int i,int j,int k){
        this.i=i;
        this.j=j;this.k=k;
    }
static interface I1{
    void hello(int i,int j,int k);

}
    static void print(int i,int j,int k){
        System.out.println(i+j+k);
    }
    public static void main(String[] args) {
        I1 obj= LambasDemo3::new;
        obj.hello(10,20,30);
    }
}
