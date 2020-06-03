package ro.unitbv.javadatatype.shapes;

public interface Shape {

    void draw();

    double getArea();

    String getName();

    String getHexFillColor();

    int getBorderWidth();

}