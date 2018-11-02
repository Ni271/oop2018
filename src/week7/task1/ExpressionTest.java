package week7.task1;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ExpressionTest{
    public static void main(String[] args){

        Expression x1 = new Square(new Numeral(10));
        Expression x3 = new Multiplication(new Numeral(2), new Numeral(3));
        Expression x4 = new Subtraction(x1, new Numeral(1));
        Expression x5 = new Addition(x4, x3);
        //Expression x6 = new Division(x1, new Numeral(0));
        Expression x = new Square(x5);

        //Expression y = new Addition(x5, x6);

        System.out.println(x.evaluate());
        //System.out.println(y.toString() + "=" + y.evaluate());
    }
}