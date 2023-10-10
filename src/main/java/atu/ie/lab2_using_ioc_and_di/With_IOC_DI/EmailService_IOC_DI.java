package atu.ie.lab2_using_ioc_and_di.With_IOC_DI;

import org.springframework.stereotype.Service;

@Service
public class EmailService_IOC_DI {
    public void sendEmail(String email, String message){
        System.out.println("Sending email to " + email + ":" + message);
    }
}
