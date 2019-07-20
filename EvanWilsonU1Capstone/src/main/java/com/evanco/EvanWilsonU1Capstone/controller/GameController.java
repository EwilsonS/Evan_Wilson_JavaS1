package com.evanco.EvanWilsonU1Capstone.controller;

import com.evanco.EvanWilsonU1Capstone.model.Game;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {
    //@Autowired
    // service Layer here


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game createGame(Game game){
        System.out.println("=== CREATE Game method ====");
        return null;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getAllGames() {
        System.out.println("=== ALL Games ========");
        return null;
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Game getGame(@PathVariable("id") int id) {
        System.out.println("=== GET Game =======");
        return null;
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGame(@PathVariable("id") int id, @RequestBody @Valid Game game){
        System.out.println("=== UPDATE Game =====");
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGame(@PathVariable("id") int id){
        System.out.println("=== DELETE Game)");
    }

    @GetMapping("/title?{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getGamesByTitle(@PathVariable("title") String title){
        System.out.println("=== GET by title =====");
        return null;
    }
    @GetMapping("/esrb_rating?{esrb}")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getGamesByRating(@PathVariable("esrb") String esrb){
        System.out.println("=== GET by esrb =====");
        return null;
    }
    @GetMapping("/studio?{studio}")
    @ResponseStatus(HttpStatus.OK)
    public List<Game> getGamesByStudio(@PathVariable("studio") String studio){
        System.out.println("=== GET by studio =====");
        return null;
    }
}
