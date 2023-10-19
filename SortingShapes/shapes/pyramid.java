package SortingShapes.shapes;
import java.util.*;
import java.math.*;

public class pyramid extends shapeADT {
	String type;
    double height;
    double length;

    public pyramid(String type, double length, double height) {
        this.type = type;
    	this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = l * 2;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (1/3) * 3 * l * 2 * h;
        return volume;
    }
}
