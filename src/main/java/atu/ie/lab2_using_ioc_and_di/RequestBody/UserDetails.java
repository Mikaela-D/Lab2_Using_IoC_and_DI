package atu.ie.lab2_using_ioc_and_di.RequestBody;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDetails {
    private String name;
    private String email;
}
