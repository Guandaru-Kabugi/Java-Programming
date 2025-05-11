package Encapsulation;

import javax.swing.plaf.synth.SynthUI;

public class UserProfile {

    //private variables;
    private String username;
    private String password;
    private String email;

    //constructor
    public UserProfile(String username,String password,String email){
        this.username = username;
        setPassword(password); //supports validation
        setEmail(email); //supports validation
    }
    //getter for username
    public String getUsername(){
        return username;
    }
    //set username

    public void setUsername(String username) {
        this.username = username;
    }
    //get the password

    public String getPassword() {
        return password;
    }
    //set the password

    public void setPassword(String password) {
        if(isValidPassword(password)){
            this.password = password;
            System.out.println("Password reset successful.");
        }
        else{
            System.out.println("Invalid password. Must be at least 8 characters");

        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(isValidEmail(email)){
            this.email = email;
        }else{
            System.out.println("Invalid Email Format");
        }

    }
    //validation
    private boolean isValidPassword(String password){
        return password.length() >=8;
    }
    //validation
    private boolean isValidEmail(String email){
        return email.contains("@") && email.contains(".");
    }
    //display
    public void displayUserInfo(){
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
    }
}
