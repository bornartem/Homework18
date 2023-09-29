
package study.java.springfirstlesson.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorService {
    private int counter = 10;
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }
    public String getSum(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " + " + num2 + " = " + counter;
    }
    public String getMinus(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " - " + num2 + "  = 0";
    }
    public String getMultiply(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " * " + num2 + "  = 25";
    }
    public String getDivide(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " / " + num2 + "  = 1";
    }
}
