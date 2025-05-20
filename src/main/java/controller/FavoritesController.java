package controller;

@RestController
@RequestMapping("/favorites")
public class FavoritesController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from FavoritesController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from FavoritesController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from FavoritesController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from FavoritesController";
    }
}