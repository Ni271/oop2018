package week4.task2;

public class Rectangle extends Shape {
    protected double width = 1.0;
    protected double length = 1.0;
        //TODO:
    Rectangle(){

    }
    Rectangle(double w, double l){
        width = w;
        length = l;
    }
    Rectangle(double w, double l, String c, boolean f){
        super(c, f);
        width = w;
        length = l;
    }
        //TODO: getter
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
        //TODO:
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
        //TODO:
    public double getArea(){
        return 2*(width+length);
    }
        //TODO:
    public double getPerimeter(){
        return width*length;
    }
        //TODO:
    public String toString(){
        String s;
        s = super.toString() + ", width: " + width+", length: "+length+", area: "+ getArea()+", perimeter: "+getPerimeter();
        return s;
    }
}