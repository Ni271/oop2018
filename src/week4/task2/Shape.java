package week4.task2;

public class Shape {
        //TODO: Khai báp thuộc tính
    protected String color;
    protected boolean filled;
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
        //TODO:
    public String toString(){
        return "color: " + color + ", isFilled: " + filled;
    }
        //TODO:
    Shape(){

    }
    Shape(String c, boolean f){
        color = c;
        filled = f;
    }
}
