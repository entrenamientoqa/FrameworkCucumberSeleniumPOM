/**
 * Framework base for web automation
 * Autor: ilanalab and onoff
 * Fecha: 2023
 * package models
 * Contains classes objects that represent application-specific data or entities
 */

package models;
public class LoginModel {

    private String username;
    private String password;
    public LoginModel () {
        this.username = " ";
        this.password = " ";
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

}
