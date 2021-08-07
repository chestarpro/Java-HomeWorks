package org.example.model;

import java.sql.Timestamp;

public class UserModel {
    private Integer id;
    private String login;
    private String email;
    private String password;
    private String gender;
    private Timestamp dateOfRegistration;

    public UserModel() {

    }

    public UserModel(String login, String email, String gender, String password) {
        this.login = login;
        this.email = email;
        this.gender = gender;
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(Timestamp dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    @Override
    public String toString() {
        return String.format("User: (login) %s | (email) %s | (gender) %s",
                this.login, this.email, this.gender);
    }
}
