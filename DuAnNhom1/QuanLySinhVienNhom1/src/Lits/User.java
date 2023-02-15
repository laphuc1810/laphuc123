/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lits;

/**
 *
 * @author hoang
 */
public class User {
    private String Username;
    private String Password;
    private String Confirm;
    private String role;

    public User() {
    }

    public User(String Username, String Password, String Confirm, String role) {
        this.Username = Username;
        this.Password = Password;
        this.Confirm = Confirm;
        this.role = role;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getConfirm() {
        return Confirm;
    }

    public void setConfirm(String Confirm) {
        this.Confirm = Confirm;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
}
