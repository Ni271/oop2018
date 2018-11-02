package week7.task1;

public class Numeral extends Expression{
    private int value;

    Numeral(int n){
        value = n;
    }
    Numeral(){
        value = 0;
    }

    public String toString(){
        return " " + this.value;
    }
    public int evaluate(){
        return this.value;
    }
}
