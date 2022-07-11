package exam;

public class VariableScope {
    public static void main(String[] args) {
        var i=10;
        VariableScope variableScope= new VariableScope();
        variableScope.findAnswer(true);
        int i1=10;
        {
            int j1=20;
            {
                int k1=30;
            }
            System.out.println(j1);
        }
    }
    public int var(){
        return 1;
    }

    public void findAnswer(boolean check){
        int answer;
        int otherAnswer;
        int onlyOneAnswer;
        if(check){
            onlyOneAnswer=1;
            answer=1;
        }else {
            answer=2;
        }
        System.out.println(answer);
        //System.out.println(onlyOneAnswer);
    }
}
