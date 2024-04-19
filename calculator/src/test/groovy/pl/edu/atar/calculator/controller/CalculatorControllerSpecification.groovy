package pl.edu.atar.calculator.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import pl.edu.atar.calculator.service.CalculatorService
import spock.lang.Specification
import spock.mock.DetachedMockFactory

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(controllers = [CalculatorController])
class CalculatorControllerSpecification extends Specification {

    @Autowired
    protected MockMvc mvc

    @Autowired
    protected CalculatorService calculatorService;

    @Autowired
    protected ObjectMapper objectMapper

    def "should calculate 'a' + 'b' and return 'ok' status"() {
        given:
        Map request = [
                "a": 1.0,
                "b": 2.0,
                "operation": "+"
        ]

        and:
        calculatorService.calculate(1.0, 2.0, "+") >> Optional.of(3.0.doubleValue())

        when:
        def result = mvc
                .perform(post("/calculate").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))

        then:
        result.andExpect(status().isOk())

        and:
        result.andExpect(jsonPath("result").value(3.0))
    }

    def "should calculate 'a' - 'b' and return 'ok' status"() {
        given:
        Map request = [
                "a": 3.0,
                "b": 1.0,
                "operation": "-"
        ]

        and:
        calculatorService.calculate(3.0, 1.0, "-") >> Optional.of(2.0.doubleValue())

        when:
        def result = mvc
                .perform(post("/calculate").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))

        then:
        result.andExpect(status().isOk())

        and:
        result.andExpect(jsonPath("result").value(2.0))
    }

    @TestConfiguration
    static class StubConfig {
        DetachedMockFactory detachedMockFactory = new DetachedMockFactory()

        @Bean
        CalculatorService calculatorService() {
            return detachedMockFactory.Stub(CalculatorService)
        }
    }
}