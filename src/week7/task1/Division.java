package week7.task1;

public class Division extends BinaryExpression{
    private Expression numberator, denominator;

    Division(Expression n, Expression d){
        numberator = n;
        denominator = d;
    }

    public Expression left(){
        return numberator;
    }

    public Expression right(){
        return denominator;
    }

    public String toString(){
        try {
            return "(" + numberator.evaluate() / denominator.evaluate() + ")";
        }
        catch(ArithmeticException e){
            return "Loi chia cho 0";
        }
    }

    public int evaluate(){
        try {
            return numberator.evaluate() / denominator.evaluate();
        }
        catch(ArithmeticException e){
            System.out.println("Loi chia cho 0");
            return 0;
        }
    }
}
