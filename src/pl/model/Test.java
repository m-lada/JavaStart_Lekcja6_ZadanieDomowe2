package pl.model;

import pl.logic.PointTools;
import pl.logic.Point;

public class Test {
    public static void main(String[] args) {
        PointTools pointTools = new PointTools();

        Point point = pointTools.newPointFromUser();
        System.out.print("Punkt o wsp. x = " + point.getX() + " oarz y = " + point.getY());
        System.out.println(" znajduje się w " + pointTools.coordinateSystem(point)  + " ćwiartce");
    }
}
