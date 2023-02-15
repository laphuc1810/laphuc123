/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lits;

/**
 *
 * @author Phuc
 */
public class Login {
    private String User;
    private String Pass;
    private String Confirm;

    public Login() {
    }

    public Login(String User, String Pass, String Confirm) {
        this.User = User;
        this.Pass = Pass;
        this.Confirm = Confirm;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getConfirm() {
        return Confirm;
    }

    public void setConfirm(String Confirm) {
        this.Confirm = Confirm;
    }
    
    
}
