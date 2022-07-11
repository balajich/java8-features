package exam;

public class DataTypes {
    public static void main(String[] args) {
        byte b=0b11;
        byte b1=0B11; //Binary
        byte b2=01;//Octal representation
        byte b3=0x1;//Hexa decimal representation
        System.out.println(b);
        //short numPets=5L; //Compiler error long to short
        //int numGrains=2.0;//Compiler error double to int
        //int numGrains=2.0f;//Compiler error float to int
        short s=10;
        int i=10;
        long l=10l;//s

        //long max = 3123456789;//This will not complie

        double d=3_1;
        double d1=3.1;
     /*   double d2=3_.1;//incorrect
        double d3=3._1;//incorrect
        double d4=3.1_;//incorrect*/
        double d5=3.1_0;//correct




    }
}
