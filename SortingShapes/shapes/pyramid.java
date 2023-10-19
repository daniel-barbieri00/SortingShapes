public class pyramid extends shapeADT {
    double height;
    double length;

    public pyramid(double length, double height) {
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