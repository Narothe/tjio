package pl.edu.atar.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.atar.calculator.dto.CalculationRequest;
import pl.edu.atar.calculator.dto.CalculationResponse;
import pl.edu.atar.calculator.service.CalculatorService;

import java.util.Optional;

@RestController
class CalculatorController {

    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    ResponseEntity<CalculationResponse> calculate(@RequestBody CalculationRequest request) {

        Optional<Double> result = calculatorService.calculate(request.a(), request.b(), request.operation());

        return result
                .map(value -> new ResponseEntity<>(new CalculationResponse(value), HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(null, HttpStatus.BAD_REQUEST));
    }
}
