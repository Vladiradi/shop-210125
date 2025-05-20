package controller;

@RestController
@RequestMapping("/cart")
public class CartController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from CartController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from CartController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from CartController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from CartController";
    }
}