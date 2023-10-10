package atu.ie.lab2_using_ioc_and_di.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final RegisterUserBody registerUserBody;

    @Autowired
    public UserController(RegisterUserBody registerUserBody) {
        this.registerUserBody = registerUserBody;
    }

    @PostMapping("/register")
    public String Register(@RequestBody UserDetails userDetails){
        return registerUserBody.msg(userDetails);
    }
}
