package com.felipeParada.InventoryTLT.restControllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class UserRestController {
    
    @GetMapping("/")
    public String holaMundo(){
        return "Wena Chelo";
    }
    
}
