package SortingShapes.shapes;
import java.util.*;
import java.math.*;

public class cylinder extends shapeADT {
    String type;
	double height;
    double length;

    public cylinder(String type, double length, double height) {
        this.type = type;
    	this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = 3.141592 * l * 2;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = 3.141592 * l * 2 * h;
        return volume;
    }
}
