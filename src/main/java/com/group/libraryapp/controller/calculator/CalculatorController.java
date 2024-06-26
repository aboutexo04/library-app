package com.group.libraryapp.controller.calculator;

import com.group.libraryapp.dto.calulator.request.CalculatorAddRequest;
import com.group.libraryapp.dto.calulator.request.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request){
    return request.getNumber1()+request.getNumber2();
}

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request){
        return request.getNumber1()*request.getNumber2();
    }

}
