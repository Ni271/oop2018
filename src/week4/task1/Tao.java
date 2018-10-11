package week4.task1;

public class Tao extends HoaQua{
        //TODO: Khai báo thuộc tính
    protected boolean dinhdanh; // Định danh vùng miền
        //TODO: Phương thức khởi tạo
    Tao(){

    }
    Tao(String n, String place, double p, boolean dd){
        super(n, place, p);
        dinhdanh = dd;
    }
        //TODO: In thông tin ra màn hình
    public void getInfo(){
        String Info;
        Info = name + " " + xx + ": " + price;
        System.out.println(Info);
        System.out.println("Dinh danh: " + dinhdanh);
    }
}
