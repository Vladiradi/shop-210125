package controller;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from CategoriesController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from CategoriesController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from CategoriesController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from CategoriesController";
    }
}