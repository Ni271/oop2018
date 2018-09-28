package week2.task3;

public class Task3 {
    public static void main(String[] args) {
        humanhealth watashi = new humanhealth("Ly", 1.60, 53.5);
        Chicken watashinochicken = new Chicken("01", 2.0, 5);
        Teacher sensei = new Teacher("Phuong sensei", "Japanese A2", "B");

        watashi.in(watashi);
        watashinochicken.in(watashinochicken);
        sensei.in(sensei);
    }
}

