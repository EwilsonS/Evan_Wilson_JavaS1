package com.evanco.EvanWilsonU1Capstone.controller;

import com.evanco.EvanWilsonU1Capstone.model.Tshirt;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tshirt")
public class TshirtController {

    //@Autowired
    // service Layer here

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tshirt createTshirt(@RequestBody @Valid Tshirt tshirt){
        System.out.println("=== CREATE Tshirt method ====");
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirt> getAllTshirts() {
        System.out.println("=== ALL Tshirts ========");
        return null;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Tshirt getTshirt(@PathVariable("id") int id) {
        System.out.println("=== GET Tshirt =======");
        return null;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTshirt(@PathVariable("id") int id, @RequestBody @Valid Tshirt tshirt){
        System.out.println("=== UPDATE Tshirt =====");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTshirt(@PathVariable("id") int id){
        System.out.println("=== DELETE Tshirt)");
    }

    @GetMapping("/color?{color}")
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirt> getTshirtsByColor(@PathVariable("color") String color){
        System.out.println("=== GET by color =====");
        return null;
    }

    @GetMapping("/size?{size}")
    @ResponseStatus(HttpStatus.OK)
    public List<Tshirt> getTshirtsBySize(@PathVariable("size") String size){
        System.out.println("=== GET by size =====");
        return null;
    }
}
