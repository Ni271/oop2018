package week7.task1;

public class Multiplication extends BinaryExpression{
    private Expression left, right;

    Multiplication(Expression l, Expression r){
        left = l;
        right = r;
    }

    public Expression left(){
        return left;
    }

    public Expression right(){
        return right;
    }

    public String toString(){
        return "(" + left.toString() + "*" + right.toString() + ")";
    }

    public int evaluate(){
        return left.evaluate() * right.evaluate();
    }
}
