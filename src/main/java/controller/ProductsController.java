package controller;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from ProductsController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from ProductsController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from ProductsController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from ProductsController";
    }
}