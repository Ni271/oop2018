package week4.task1;

import java.util.Date;

public class CamThanhPhong extends Cam{
        //TODO:
    Cam TP = new Cam();
    protected Date date; //
    protected int SL;
        //TODO:
    CamThanhPhong(){

    }
    CamThanhPhong(String n, String place, double p, int sl){
        super(n , place, p, true);
        Date d = new Date();
        date = d;
        SL = sl;
    }
        //TODO:
    public void getInfo(){
        super.getInfo();
        System.out.println("Ngay nhap: " + date.toString());
        System.out.println(SL);
    }
}
