public class rectangularPrism extends shapeADT {
    double height;
    double length;

    public RetangularPrism(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double calculateArea(double h, double l) {
        double area = h * l;
        return area;
    }

    
}
 