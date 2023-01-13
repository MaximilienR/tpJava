package com.example.tpbankcors.dto.request;

import com.example.tpbankcors.dto.response.CustomerDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
public class CustomerReadDto extends CustomerDTO {
    private int id;

    private String email;

    private String name;

}
