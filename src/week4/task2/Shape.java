package week4.task2;

public class Shape {
        //TODO: Khai báp thuộc tính
    protected String color = "red";
    protected boolean filled = true;
        //TODO: Gettter
    public String getColor(){
        return color;
    }
    public boolean isFilled(){
        return filled;
    }
        //TODO: Setter
    public void setColor(String c){
        color = c;
    }
    public void setFilled(boolean f){
        filled = f;
    }
        //TODO: Chuỗi thông tin về Shape
    public String toString(){
        return "color: " + color + ", isFilled: " + filled;
    }
        //TODO: Phương thức khởi tạo
    Shape(){

    }
    Shape(String c, boolean f){
        color = c;
        filled = f;
    }
}
