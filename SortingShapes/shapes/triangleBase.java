package SortingShapes.shapes;
import java.util.*;
import java.math.*;

public class triangleBase extends shapeADT {
	String type;
    double height;
    double length;

    public triangleBase(String type, double length, double height) {
        this.type = type;
    	this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = l * 2 * Math.sqrt(3) * 4;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (l * 2 * Math.sqrt(3) * 4) * h;
        return volume;
    }
}
