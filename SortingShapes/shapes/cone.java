public class cone extends shapeADT {
    double height;
    double length;

    public cone(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = pi * l * 2;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (1/3) * pi * l * 2 * h;
        return volume;
    }
}