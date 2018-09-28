package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci của số nguyên n
        if (n == 0) return 0;
        else if (n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(gcd(35, 42));
        System.out.println(fibonacci(4));
    }
}