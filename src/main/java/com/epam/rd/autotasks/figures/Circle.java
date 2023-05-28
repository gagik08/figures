package com.epam.rd.autotasks.figures;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

class Circle extends Figure {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String pointsToString() {
        return center.toString();
    }

    @Override
    public Point leftmostPoint() {
        double leftmostX = center.getX() - radius;
        return new Point(leftmostX, center.getY());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[" + pointsToString() + radiusToString() + "]";
    }

    private String radiusToString() {
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("0.0#####", symbols);
        return decimalFormat.format(radius);
    }
}
