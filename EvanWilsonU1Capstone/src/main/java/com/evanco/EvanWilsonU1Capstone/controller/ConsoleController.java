package com.evanco.EvanWilsonU1Capstone.controller;

import com.evanco.EvanWilsonU1Capstone.model.Console;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/console")
public class ConsoleController {

    //@Autowired
    // service Layer here

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Console createConsole(@RequestBody @Valid Console console){
        System.out.println("=== CREATE Console method ====");
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Console> getAllConsoles() {
        System.out.println("=== ALL Consoles ========");
        return null;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Console getConsole(@PathVariable("id") int id) {
        System.out.println("=== GET Console =======");
        return null;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateConsole(@PathVariable("id") int id, @RequestBody @Valid Console console){
        System.out.println("=== UPDATE Console =====");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteConsole(@PathVariable("id") int id){
        System.out.println("=== DELETE Console)");
    }

    @GetMapping("/manufacturer?{mfr}")
    @ResponseStatus(HttpStatus.OK)
    public List<Console> getConsolesByMfr(@PathVariable("mfr") String mfr){
        System.out.println("=== GET by mfr =====");
        return null;
    }
}
