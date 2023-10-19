package SortingShapes.shapes;
import java.util.*;
import java.math.*;

public class pentagonBase extends shapeADT {
	String type;
    double height;
    double length;

    public pentagonBase(String type, double length, double height) {
        this.type = type;
    	this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = 5 * l * 2 * Math.tan(54) * 4;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (5 * l * 2 * Math.tan(54) * 4) * h;
        return volume;
    }
}
