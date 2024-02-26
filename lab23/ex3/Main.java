package lab23.ex3;

abstract class Expression {
    public abstract double evaluate(double x);
}

class Const extends Expression {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    public double evaluate(double x) {
        return value;
    }
}

class Variable extends Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public double evaluate(double x) {
        return x;
    }
}

class  Add extends Expression {
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate(double x) {
        return left.evaluate(x) + right.evaluate(x);
    }
}

class Subtract extends Expression {
    private Expression left;
    private Expression right;

    public Subtract(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate(double x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}

class Multiply extends Expression {
    private Expression left;
    private Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}

class Divide extends Expression {
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}

public class Main {
    public static void main(String[] args) {
        double x = 2;

        Expression expression = new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")),
                        new Multiply(
                                new Const(2),
                                new Variable("x"))
                ),
                new Const(1)
        );

        double result = expression.evaluate(x);
        System.out.println(result);
    }
}