package com.hftx.model.user;

public abstract class AbstractUser {
    private String username;
    private String password;
    private String email;
    private Boolean isAdmin;


    /**/

    /*
    * --- Getters e Setters ---
    */
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*setAdmin é delegado apenas*/
    public Boolean getAdmin() {
        return isAdmin;
    }

}
