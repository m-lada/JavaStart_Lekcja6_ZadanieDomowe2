package pl.model;

import pl.logic.Logic;
import pl.logic.Point;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Logic logic = new Logic();

        Point point = logic.newPointFromUser();
        System.out.print("Punkt o wsp. x = " + point.getX() + " oarz y = " + point.getY());
        System.out.println(" znajduje się w " + logic.coordinateSystem(point)  + " ćwiartce");
    }
}
