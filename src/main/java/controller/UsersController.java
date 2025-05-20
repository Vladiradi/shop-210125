package controller;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping
    public String getAll() {
        return "Hi, I am GET from UsersController";
    }

    @PostMapping
    public String create() {
        return "Hi, I am POST from UsersController";
    }

    @PutMapping
    public String update() {
        return "Hi, I am PUT from UsersController";
    }

    @DeleteMapping
    public String delete() {
        return "Hi, I am DELETE from UsersController";
    }
}