package week4.task1;

public class Cam extends HoaQua{
        //TODO: Khởi tạo thuộc tính
    //HoaQua C = new HoaQua();
    protected boolean dinhdanh;
        //TODO: Phương thức khởi tạo
    Cam(){

    }
    Cam(String n, String place, double p, boolean dd){
        super(n, place, p);
        dinhdanh = dd;
    }
        //TODO: In ra màn hình thông tin của Cam
    public void getInfo(){
        String Info;
        Info = name + " " + xx + ": " + price;
        System.out.println(Info);
        System.out.println("Dinh danh: " + dinhdanh);
    }
}

