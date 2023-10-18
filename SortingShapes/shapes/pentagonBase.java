public class pentagonBase extends shapeADT {
    double height;
    double length;

    public pentagonBase(double length, double height) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double l, double h) {
        double area = 5 * l * 2 * tan(54) * 4;
        return area;
    }

    public double calculateVolume(double l, double h) {
        double volume = (5 * l * 2 * tan(54) * 4) * h;
        return volume;
    }
}