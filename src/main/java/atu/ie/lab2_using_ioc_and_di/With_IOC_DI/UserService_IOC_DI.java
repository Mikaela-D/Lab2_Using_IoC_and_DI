package atu.ie.lab2_using_ioc_and_di.With_IOC_DI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// UserService with annotations
@Service
public class UserService_IOC_DI {
    private final EmailService_IOC_DI emailService;

    @Autowired      // Constructor injection
    public UserService_IOC_DI(EmailService_IOC_DI emailService){
        this.emailService = emailService;   // Loose Coupling

    }
    public void registerUser(String name, String email){
        emailService.sendEmail(email, "Welcome to our platform");

    }

}
