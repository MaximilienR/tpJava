package com.example.tpbankcors.dto.request;

import com.example.tpbankcors.dto.response.CustomerDTO;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerCreateDTO implements CustomerDTO{


    private  String email;


    private  String name;

    public CustomerCreateDTO(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public  CustomerCreateDTO(){}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
