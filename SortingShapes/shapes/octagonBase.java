public class octagonBase extends shapeADT {
    double height;
    double length;

    public octagonBase(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = 2 * (1 + sqrt(2) * l * 2);
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (2 * (1 + sqrt(2) * l * 2)) * h * 4;
        return volume;
    }
}