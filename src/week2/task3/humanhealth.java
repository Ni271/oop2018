package week2.task3;

public class humanhealth {
    // TODO: Khai báo các thuộc tính của humanhealth
    private String name;
    private double height, weight;

    // TODO: Các phương thức getter, setter
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String n) {
        name = n;
    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWeight(double w) {
        weight = w;
    }

    // TODO:
    humanhealth(String n, double h, double w) {
        name = n;
        height = h;
        weight = w;
    }

    public double BMI(humanhealth A) {
        return this.getWeight() / (this.getHeight() * this.getHeight());
    }

    public String TTSK(humanhealth A) {
        double bmi = BMI(A);
        if (bmi < 18.5) return "Gầy";
        else if (bmi >= 18.5 && bmi < 25.0) return "Bình thường";
        else if (bmi >= 25.0 && bmi < 30.0) return "Hơi béo";
        else return "Béo phì";
    }
        // TODO: In ra màn hình
    public void in(humanhealth A){
        System.out.println(A.getName());
        System.out.println(A.getHeight());
        System.out.println(A.getWeight());
        System.out.println(A.BMI(A));
        System.out.println(A.TTSK(A));
    }
}
