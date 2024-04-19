package pl.edu.atar.calculator.operations;

public class Div implements Operation {

    @Override
    public double calculate(double first, double second) {
        if(second == 0){
            return 0;
        }

        return first / second;
    }
}
