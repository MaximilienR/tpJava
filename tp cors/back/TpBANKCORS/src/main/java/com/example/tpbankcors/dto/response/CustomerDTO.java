package com.example.tpbankcors.dto.response;

import lombok.Builder;
import lombok.Data;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

@Data
@Builder
public class CustomerDTO extends RepresentationModel<CustomerDTO> {
    private  int id;
    private  String name;
    private  String email;

    public CustomerDTO( ) {
     //vide
    }

    public CustomerDTO(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public CustomerDTO(Link initialLink, int id, String name, String email) {
        super(initialLink);
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public CustomerDTO(Iterable<Link> initialLinks, int id, String name, String email) {
        super(initialLinks);
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
