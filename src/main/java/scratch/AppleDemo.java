package scratch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AppleDemo {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));
        prettyPrint(inventory, Apple::toString);
        prettyPrint(inventory,Apple::echoWeight);
        prettyPrint(inventory,apple->apple.getColor().toString());
        prettyPrint(inventory,apple -> String.valueOf(apple.getWeight()));

    }
    public static void prettyPrint(List<Apple> apples, Function<Apple,String> fun)
    {
        for(Apple apple:apples){
            String output=fun.apply(apple);
            System.out.println(output);
        }
    }
    enum Color {
        RED,
        GREEN
    }

    public static class Apple {

        private int weight = 0;
        private Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color=%s, weight=%d}", color, weight);
        }

        public String echoWeight(){
            return String.valueOf(this.weight);
        }

    }

}
