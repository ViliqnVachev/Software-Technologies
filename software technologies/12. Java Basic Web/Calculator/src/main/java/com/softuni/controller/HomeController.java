package com.softuni.controller;

import com.softuni.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("operator", "+");
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

    @PostMapping("/")
    public String calculate(@RequestParam String leftOperand,
                            @RequestParam String rightOperand,
                            @RequestParam String operator,
                            Model model) {


        double left = Double.parseDouble(leftOperand);
        double right = Double.parseDouble(rightOperand);

        Calculator calculator = new Calculator(left, right, operator);
        double result = calculator.calclulateResult();


        model.addAttribute("operator", "+");
        model.addAttribute("result", result);
        model.addAttribute("leftOperand", left);
        model.addAttribute("rightOperand", right);
        model.addAttribute("view", "views/calculatorForm");
        return "base-layout";
    }

}
