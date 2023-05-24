package com.example.Back.Entity;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;
    @Column
    private String Name;
    @Column
    private String NIF;
    @Column
    private String Email;
    @Column
    private String Password;

    @Column
    private String Rol;

    public String getName() {
        return Name;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getNIF() {
        return NIF;
    }

    public String getRol() {
        return Rol;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setNif(String nif) {
        this.NIF = nif;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPassword(String password) {
        this.Password = password;
    }


}
