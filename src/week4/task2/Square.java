package week4.task2;

public class Square extends Rectangle {
        //TODO:
    Square(){

    }
    Square(double side){
        super(side, side);
    }
    Square(double side, String c, boolean f){
        super(side, side, c, f);
    }
        //TODO:
    public double getSide(){
        return super.getLength();
    }
        //TODO:
    public void setSide(double s){

    }
    public void setWidth(double s){
        super.setWidth(s);
    }
    public void setLength(double s){
        super.setLength(s);
    }
        //TODO:
    public String toString(){
        String s;
        s = super.toString()+", side: "+getSide();
        return s;
    }
}
