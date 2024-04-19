package pl.edu.atar.calculator.service;

import org.springframework.stereotype.Service;
import pl.edu.atar.calculator.operations.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public CalculatorServiceImpl() {
    }

    @Override
    public Optional<Double> calculate(Double a, Double b, String signOperation) {

        Map<String, Operation> operations = prepareOperations();

        Operation operation = operations.get(signOperation);

        if (operation == null) {
            return Optional.empty();
        }

        return Optional.of(operation.calculate(a, b));
    }

    private Map<String, Operation> prepareOperations() {
        Map<String, Operation> operations = new HashMap<>();

        operations.put("+", new Add());
        operations.put("-", new Sub());
        operations.put("*", new Mul());
        operations.put("/", new Div());
        operations.put("%", new Rod());

        return operations;
    }
}
