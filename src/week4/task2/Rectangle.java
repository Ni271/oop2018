package week4.task2;

public class Rectangle extends Shape {
        //TODO: Khởi tạo thuộc tính
    protected double width = 1.0;
    protected double length = 1.0;
        //TODO: Phương thức khởi tạo
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
        //TODO: Setter
    public void setWidth(double w){
        width = w;
    }
    public void setLength(double l){
        length = l;
    }
        //TODO: Tính diện tích hình chữ nhật
    public double getArea(){
        return width*length;
    }
        //TODO: Tính chu vi hình chữ nhật
    public double getPerimeter(){
        return 2*(width+length);
    }
        //TODO: Chuỗi thông tin về Rectangle
    public String toString(){
        String s;
        s = super.toString() + ", width: " + width+", length: "+length+", area: "+ getArea()+", perimeter: "+getPerimeter();
        return s;
    }
}