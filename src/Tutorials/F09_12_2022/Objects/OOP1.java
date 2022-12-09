package Tutorials.F09_12_2022.Objects;

public class OOP1 {
    private double radius;
    private String color;
    //constructors

    public OOP1() { //in tutorial it was NOT public
        radius = 10;
        color = "Red";
    }
    public OOP1(int r, String c) { //in tutorial it was NOT public
        this.radius=r; //radius=r;
        this.color=c; //color=c;
    }

    public double getR() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI; //r^2*P1
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double newradius) {
        this.radius = newradius; //radius=newradius;
    }

    public String info() {
        String s = "The circle with radius " + getR() + " has a color " + getColor() + ", while the area is " + getArea();
        return s;
    }
}
