public class cylinder extends shapeADT {
    double height;
    double length;

    public cylinder(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = pi * l * 2;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = pi * l * 2 * h;
        return volume;
    }
}