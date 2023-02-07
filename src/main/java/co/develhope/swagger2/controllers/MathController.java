package co.develhope.swagger2.controllers;

import co.develhope.swagger2.entities.ArithmeticOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping
    public String welcome(){
        return "Welcome on math api!";
    }
    @GetMapping(value = "/division-info")
    public ArithmeticOperation divisionInfo(){
        String[] properties = {"Division by 1", "Division by 0", "Division by itself", "Division of 0 by any number"};
        return new ArithmeticOperation(
                "Division",
                0,
                "Basic division arithmetic operation",properties);}

    @GetMapping ( value = "/multiplication" )
    public int getMultiplication(
            @RequestParam ( required = true ) int operand1,@RequestParam ( required = true ) int operand2){
        return operand1 * operand2;
    }

}