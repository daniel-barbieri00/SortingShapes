package SortingShapes.shapes;
import java.util.*;
import java.math.*;

public class octagonBase extends shapeADT {
	String type;
    double height;
    double length;

    public octagonBase(String type, double length, double height) {
        this.type = type;
    	this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = 2 * (1 + Math.sqrt(2) * l * 2);
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (2 * (1 + Math.sqrt(2) * l * 2)) * h * 4;
        return volume;
    }
}
