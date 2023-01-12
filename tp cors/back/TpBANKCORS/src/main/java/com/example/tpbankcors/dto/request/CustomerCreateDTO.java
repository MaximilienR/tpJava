package com.example.tpbankcors.dto.request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerCreateDTO {


    private  String email;


    private  String name;

}
