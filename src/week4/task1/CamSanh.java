package week4.task1;

import java.util.Date;

public class CamSanh extends Cam{
        //TODO: Khai báo thuộc tính
    protected Date date; //Ngày nhập là thời gian xuất thông tin
    protected int SL;
        //TODO: Phương thức khởi tạo
    CamSanh(){

    }
    CamSanh(String n, String place, double p, int sl){
        super(n , place, p, true);
        Date d = new Date();
        date = d;
        SL = sl;
    }
        //TODO: In thông tin ra màn hình
    public void getInfo(){
        super.getInfo();
        System.out.println("Ngay nhap: " + date.toString());
        System.out.println(SL);
    }
}
