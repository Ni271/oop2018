package week4.task1;

public class Tao extends HoaQua{
    HoaQua T = new HoaQua();
    protected boolean dinhdanh;

    Tao(){

    }
    Tao(String n, String place, double p, boolean dd){
        super(n, place, p);
        dinhdanh = dd;
    }

        //TODO: Get Information
    public void getInfo(){
        String Info;
        Info = name + " " + xx + ": " + price;
        System.out.println(Info);
        System.out.println("Dinh danh: " + dinhdanh);
    }
}
