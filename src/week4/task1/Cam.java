package week4.task1;

public class Cam extends HoaQua{
    HoaQua C = new HoaQua();
    protected boolean dinhdanh;

    Cam(){

    }
    Cam(String n, String place, double p, boolean dd){
        super(n, place, p);
        dinhdanh = dd;
    }
        //TODO: Get information
    public void getInfo(){
        String Info;
        Info = name + " " + xx + ": " + price;
        System.out.println(Info);
        System.out.println("Dinh danh: " + dinhdanh);
    }
}

