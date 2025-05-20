package controller;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from OrdersController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from OrdersController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from OrdersController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from OrdersController";
    }
}