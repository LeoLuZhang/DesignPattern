package Designpattern.Flyweight;

import java.util.*;
public class ShapeFactory {

    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }


}