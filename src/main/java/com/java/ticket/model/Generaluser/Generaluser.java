package com.java.ticket.model.Generaluser;

import javax.persistence.Entity;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Generaluser {


    @Id
    private Long id;
    
    private String firstName;

    private String lastName;

    private String email;

    private String username;

    private String password;

    private Role role;


    public enum Role {
        USER,SUPPORT,ADMIN,TESTER
    }
}