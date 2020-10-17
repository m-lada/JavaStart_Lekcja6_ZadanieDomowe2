package pl.logic;

import java.util.Scanner;

public class Logic {

    public String coordinateSystem(Point point) {
        String quadrant;
        if (point.getX() < 0 && point.getY() > 0) {
            quadrant = "I";
        } else if (point.getX() > 0 && point.getY() > 0) {
            quadrant = "II";
        } else if (point.getX() > 0 && point.getY() < 0) {
            quadrant = "III";
        } else if (point.getX() < 0 && point.getY() < 0) {
            quadrant = "IV";
        } else quadrant = "Punkt 0,0";
        return quadrant;
    }

    public Point newPointFromUser() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Podaj x:");
        x = scanner.nextInt();
        System.out.println("Podaj y:");
        y = scanner.nextInt();
        return new Point(x, y);
    }
}
