package atu.ie.lab2_using_ioc_and_di.Without_IOC_DI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService user;

    public UserController() {
        user = new UserService();
    }
    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        user.registerUser(name, email);
        return name + "Without IOC registered email is: " + email;

    }
}
