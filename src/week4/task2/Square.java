package week4.task2;

public class Square extends Rectangle {
        //TODO: Phương thức khởi tạo
    Square(){

    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String c, boolean f){
        super(side, side, c, f);
    }

        //TODO: Getter
    public double getSide(){
        return super.getLength();
    }
        //TODO: Setter
    public void setSide(double s){
        super.setLength(s);
        super.setWidth(s);
    }
    public void setWidth(double s){
        super.setWidth(s);
    }
    public void setLength(double s){
        super.setLength(s);
    }
        //TODO: Chuỗi thông tin về Square
    public String toString(){
        String s;
        s = super.toString()+", side: "+getSide();
        return s;
    }
}
