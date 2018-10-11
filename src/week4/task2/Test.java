package week4.task2;

public class Test {
        //TODO: Kiểm tra chương trình
    public static void main(String[] args){
        Circle C1 = new Circle(2.5);
        Circle C2 = new Circle(2.0, "green", true);

        Rectangle R1 = new Rectangle(2, 3);
        Rectangle R2 = new Rectangle(4, 5, "brown", false);

        Square S1 = new Square(4);
        Square S2 = new Square(4, "black", false);

        System.out.println(C1.toString());
        System.out.println(C2.toString());
        System.out.println(R1.toString());
        System.out.println(R2.toString());
        System.out.println(S1.toString());
        System.out.println(S2.toString());
    }
}
