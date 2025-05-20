package controller;

@RestController
@RequestMapping("/order-items")
public class OrderItemsController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from OrderItemsController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from OrderItemsController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from OrderItemsController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from OrderItemsController";
    }
}