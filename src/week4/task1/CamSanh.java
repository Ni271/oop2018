package week4.task1;

import java.util.Date;

public class CamSanh extends Cam{
        //TODO:
    Cam S = new Cam();
    protected Date date; //
    protected int SL;
        //TODO:
    CamSanh(){

    }
    CamSanh(String n, String place, double p, int sl){
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
