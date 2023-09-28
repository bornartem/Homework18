package study.java.springfirstlesson.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class Calculator {
    @GetMapping
    public String calculator(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String getSum(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " + " + num2 + "  = 10";
    }
    @GetMapping(path = "/minus")
    public String getMinus(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " - " + num2 + "  = 0";
    }
    @GetMapping(path = "/multiply")
    public String getMultiply(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " * " + num2 + "  = 25";
    }
    @GetMapping(path = "/divide")
    public String getDivide(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " "+ " / " + num2 + "  = 1";
    }
}
