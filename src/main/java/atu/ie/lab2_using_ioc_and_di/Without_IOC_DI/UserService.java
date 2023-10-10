package atu.ie.lab2_using_ioc_and_di.Without_IOC_DI;

// UserService without IOC/DI
public class UserService {
    private EmailService emailService;
    public UserService(){
        this.emailService = new EmailService();     // Tight coupling
    }
    public void registerUser(String name, String email) {
        emailService.sendEmail(email, "Welcome to our platform!");
    }
}
