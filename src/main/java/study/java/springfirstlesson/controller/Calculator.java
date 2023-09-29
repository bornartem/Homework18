package study.java.springfirstlesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.java.springfirstlesson.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator (CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String calculator(){
        return calculatorService.calculator();
    }

    @GetMapping(path = "/plus")
    public String getSum(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.getSum(num1,num2);
    }
    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.getMinus(num1,num2);
    }
    @GetMapping(path = "/multiply")
    public String getMultiply(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.getMultiply(num1,num2);
    }
    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam String num1, @RequestParam String num2) {
        return calculatorService.getDivide(num1,num2);
    }
}
