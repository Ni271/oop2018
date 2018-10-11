package week4.task2;

public class Circle extends Shape {
        //TODO: Khởi tạo thuộc tính
    protected double radius = 1.0;
    protected double PI = 3.14;
        //TODO: Phương thức khởi tạo
    Circle(){

    }
    Circle(double r){
        radius = r;
    }
    Circle(double r, String c, boolean f){
        super(c, f);
        radius = r;
    }
        //TODO: Getter, setter radius
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        radius = r;
    }
        //TODO: Tính diện tích hình tròn
    public double getArea(){
        return PI*radius*radius;
    }
        //TODO: Tính chu vi hình tròn
    public double getPerimeter(){
        return 2*PI*radius;
    }
        //TODO: Chuỗi thông tin về Circle
    public String toString(){
        String s;
        s = super.toString() + ", radius:  " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter();
        return s;
    }
}
