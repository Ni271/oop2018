package week4.task1;

public class FruitStore {
        //TODO: Phương thức main
    public static void main(String[] args){
        CamThanhPhong C1 = new CamThanhPhong("TP1", "Thanh Phong", 36.5, 200);
        CamSanh C2 = new CamSanh("S1", "Lang Son", 25.0, 200);
        Tao T = new Tao("TaoMy", "America", 85, true);
        C1.getInfo();
        C2.getInfo();
        T.getInfo();
    }
}
