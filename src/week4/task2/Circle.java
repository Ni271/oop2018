package week4.task2;

public class Circle extends Shape {
    protected double radius = 1.0;
    protected double PI = 3.14;

    Circle(){

    }
    Circle(double r){
        radius = r;
    }
    Circle(double r, String c, boolean f){
        super(c, f);
        radius = r;
    }
        //TODO:
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
        //TODO:
    public double getArea(){
        return 2*PI*radius;
    }
    public double getPerimeter(){
        return PI*radius*radius;
    }
    public String toString(){
        String s;
        s = super.toString() + ", radius:  " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter();
        return s;
    }
}
