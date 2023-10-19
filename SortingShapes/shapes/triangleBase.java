public class triangleBase extends shapeADT {
    double height;
    double length;

    public triangleBase(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double baseArea = l * 2 * sqrt(3) * 4;
    }

    public double calculateVolume(double l, double h) {
        double volume = (l * 2 * sqrt(3) * 4) * h;
    }
}