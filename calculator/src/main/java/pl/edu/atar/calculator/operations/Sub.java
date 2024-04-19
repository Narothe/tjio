package pl.edu.atar.calculator.operations;

public class Sub implements Operation {
    @Override
    public double calculate(double first, double second) {
        return first - second;
    }
}
