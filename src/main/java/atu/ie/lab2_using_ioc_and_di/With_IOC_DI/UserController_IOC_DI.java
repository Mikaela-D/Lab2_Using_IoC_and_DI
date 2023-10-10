package atu.ie.lab2_using_ioc_and_di.With_IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController_IOC_DI {
    private final UserService_IOC_DI userService;

    @Autowired
    public UserController_IOC_DI(UserService_IOC_DI userService) {
        this.userService = userService;
    }

}
