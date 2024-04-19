package pl.edu.atar.calculator.service;

import java.util.Optional;

public interface CalculatorService {
    Optional<Double> calculate(Double a, Double b, String signOperation);
}
