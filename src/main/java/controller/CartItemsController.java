package controller;

@RestController
@RequestMapping("/cart-items")
public class CartItemsController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from CartItemsController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from CartItemsController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from CartItemsController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from CartItemsController";
    }
}