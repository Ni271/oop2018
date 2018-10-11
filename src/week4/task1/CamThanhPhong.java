package week4.task1;

import java.util.Date;

public class CamThanhPhong extends Cam{
        //TODO: Khởi tạo thuộc tính
    protected Date date; //
    protected int SL;
        //TODO: Phương thức khởi tạo
    CamThanhPhong(){

    }
    CamThanhPhong(String n, String place, double p, int sl){
        super(n , place, p, true);
        Date d = new Date();
        date = d;
        SL = sl;
    }
        //TODO: In ra màn hình thông tin của CamThanhPhong
    public void getInfo(){
        super.getInfo();
        System.out.println("Ngay nhap: " + date.toString());
        System.out.println(SL);
    }
}
