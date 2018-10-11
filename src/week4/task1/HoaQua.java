package week4.task1;

import java.util.Date;

public class HoaQua {
    protected String name, xx;
    protected double price;

        //TODO: Getter
    public String getName() {
        return name;
    }
    public String getXx(){
        return xx;
    }
    public double getPrice(){
        return price;
    }
        //TODO: Setter
    public void setName(String n){
        name = n;
    }
    public void setXx(String place){
        xx = place;
    }
    public void setPrice(double p){
        price = p;
    }
        //TODO: Khoi tao
    HoaQua(){
    }
    HoaQua(String n, String place, double p){
        name = n;
        xx = place;
        price = p;
    }
    HoaQua(HoaQua A){
        name = A.name;
        xx = A.xx;
        price = A.price;
    }
}