package week7.task1;

public class Square extends Expression{
    Expression expression;

    Square(Expression e) {
        expression = e;
    }

    public String toString () {
        return "(" + expression.toString() + ")^2";
    }

    public int evaluate () {
        return expression.evaluate() * expression.evaluate();
    }
}
