package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    public int numerator, demoninator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator=numerator;
        this.demoninator=denominator;
    }
        // TODO: Tìm ước chung lớn nhất của 2 số
    public static int gcd(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

        // TODO: Tìm bội chung nhỏ nhất của 2 số
    public static int BCNN(int a, int b){
        return a*b/gcd(a, b);
    }

        // TODO: Rút gọn phân số
    public static int RG(Fraction F){
        int n, d;
        if(F.numerator < 0) n=-F.numerator;
        else n=F.numerator;
        if(F.demoninator < 0) d=-F.demoninator;
        else d=F.demoninator;
        int MSC=gcd(n, d);
        F.numerator=F.numerator/MSC;
        F.demoninator=F.demoninator/MSC;
        return 0;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        int d=BCNN(this.demoninator, other.demoninator);
        int n=this.numerator*(d/this.demoninator) + other.numerator*(d/other.demoninator);
        Fraction ADD = new Fraction(n, d);
        RG(ADD);
        return ADD;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        int d=BCNN(this.demoninator, other.demoninator);
        int n=this.numerator*(d/this.demoninator) - other.numerator*(d/other.demoninator);
        Fraction Sub = new Fraction(n, d);
        RG(Sub);
        return Sub;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        int n=this.numerator * other.numerator;
        int d=this.demoninator * other.demoninator;
        Fraction Mul = new Fraction(n, d);
        RG(Mul);
        return Mul;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if (other.demoninator != 0){
            int n = this.numerator * other.demoninator;
            int d = this.demoninator * other.numerator;
            Fraction Div = new Fraction(n, d);
            RG(Div);
            return Div;
        }
        return null;
    }

    public boolean equals(Object obj){
            // TODO: So sánh 2 phân số
        Fraction F = new Fraction(1, 1);
        F=this.subtract((Fraction)obj); // TODO: Ép kiểu
        if(F.numerator == 0) return true;
        return false;
    }

    public static void main(String[] args){
        Fraction W = new Fraction(2, 9);
        Fraction C = new Fraction(10, 18);
        System.out.println(W.numerator+"/"+W.demoninator + "___" + C.numerator+"/"+C.demoninator);
        System.out.println("add: " + W.add(C).numerator + "/" + W.add(C).demoninator);
        System.out.println("subtract: " + W.subtract(C).numerator + "/" + W.subtract(C).demoninator);
        System.out.println("multiply: " + W.multiply(C).numerator + "/" + W.multiply(C).demoninator);
        System.out.println("divide: " + W.divide(C).numerator + "/" + W.divide(C).demoninator);
        System.out.println("equal?: " +W.equals(C));
    }
}
