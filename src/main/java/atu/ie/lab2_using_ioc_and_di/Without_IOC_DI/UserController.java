package atu.ie.lab2_using_ioc_and_di.Without_IOC_DI;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService user;

    public UserController(){
        user = new UserService();
    }
}
