package labsheet9.exercise2;

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse()
    {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);

    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }



    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();


    }


    public double area() {
       Double Pi = 3.142;
       Double Area = Pi*(getMajorAxis())*(getMinorAxis());
        return Area;
    }


    public double perimeter() {
        Double Pi = 3.142;
        Double Perimeter = 2*Pi*((getMajorAxis() * getMajorAxis() + (getMinorAxis()*getMinorAxis()))/2)*0.5;
        if(Perimeter<0)
            return 0;
        else
            return Perimeter;

    }
}
