package week2.task3;

public class Chicken {
    // TODO: Khai báo các thuộc tính của flower
    private String ID;
    private double kgTA;
    private Integer soT;

    // TODO: Các phương thức getter, setter
    public String getID() {
        return ID;
    }

    public double getkgTA() {
        return kgTA;
    }

    public Integer getsoT() {
        return soT;
    }

    public void setID(String id) {
        ID = id;
    }

    public void setKgTA(double kg) {
        kgTA = kg;
    }

    public void setsoT(Integer T) {
        soT = T;
    }

    //TODO:
    Chicken(String id, double kg, Integer t) {
        ID = id;
        kgTA = kg;
        soT = t;
    }

    // TODO: Tính tỉ lệ chuyển đổi thức ăn trong chăn nuôi gia cầm để trứng
    public double FCR(Chicken C) {
        return 10 * (C.getkgTA() / C.getsoT());
    }
        // TODO: In ra màn hình
        public void in(Chicken A){
            System.out.println(A.getID());
            System.out.println(A.getkgTA());
            System.out.println(A.getsoT());
            System.out.println(A.FCR(A));
        }
}
