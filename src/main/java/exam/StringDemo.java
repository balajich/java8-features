package exam;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
//        int three = 3;
//        String four = "4";
//        System.out.println(1 + 2 + three + four);
//        String s="HelloWorld";
//        //Display all chars of String
//        for(int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }
//        //Reverse String
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.println(s.charAt(i));
//        }
        //Chaining
        //System.out.println("hello ".trim().toUpperCase());
//
//        StringBuilder sb = new StringBuilder();
//        for(char c='a';c<='z';c++){
//            sb.append(c);
//        }
//        System.out.println(sb);
//
//        StringBuilder sb1= new StringBuilder("Sample");
//        System.out.println(sb1.reverse());

        String s1="Hello";
        String s2="Hello";
        System.out.println(s1==s2);
        String s3= new String("Hello").intern();
        System.out.println(s1==s3);
        String s4="H"+"e"+"l"+"l"+"o";
        System.out.println(s1==s4);


    }

}
