package Model;

import jakarta.persistence.Entity;

@Entity
public class User {
    private Long IdUser;
    private String name;
    private String password;
    private String email;
    private String NIF;


}
