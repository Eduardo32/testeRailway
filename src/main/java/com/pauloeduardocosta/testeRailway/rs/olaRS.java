package com.pauloeduardocosta.testeRailway.rs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("ola")
public class olaRS {

    @GetMapping("mundo")
    public ResponseEntity teste(){
        return ResponseEntity.ok("Olá, Mundo!");
    }
}
