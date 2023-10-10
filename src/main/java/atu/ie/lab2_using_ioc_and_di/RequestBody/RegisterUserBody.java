package atu.ie.lab2_using_ioc_and_di.RequestBody;

import lombok.Data;
import org.springframework.stereotype.Service;

@Data
@Service
public class RegisterUserBody {
    public String msg(UserDetails userDetails){
        return"Congratulations!! " +  userDetails.getName() + ". You are registered on this address: " + userDetails.getEmail();
    }
}