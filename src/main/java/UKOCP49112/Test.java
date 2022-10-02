package UKOCP49112;

import java.util.function.*;
 
class Point {
    int x, y;
 
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
 
    public boolean equals(Object obj) {
        if(obj != null) {
            return this.y == ((Point)obj).y + 1;
        }
        return false;
    }
}
 
public class Test {
    public static void main(String[] args) {
        Predicate<Point> predicate = Predicate.isEqual(new Point(2, 3));
        System.out.println(predicate.test(new Point(2,2)));
    }
}