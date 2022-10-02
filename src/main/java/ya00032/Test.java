package ya00032;

public class Test {

    public static void main(String[] args) {
         short i= (short)32768;
         String s="hello";
         String s1="hello";
         if(s==s1){
             System.out.println("They are equal");
         }
         if(s.equals(s1)){
             System.out.println("They are equal");
         }
         StringBuilder sb= new StringBuilder();
         sb.append("A").append("B").append("C");
        System.out.println(sb);

    }
}
