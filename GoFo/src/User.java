import java.util.Scanner;
/**
 *@author Taha Mohamed Yousef
 */
public class User {
    protected String Name , Email , ID , Password , DefaultLocation;
    Scanner input = new Scanner(System.in);
    public User(){}

    /**
     * this setting the name of the user
     * @param Name name of the user
     */
    public void setName(String Name){this.Name=Name;}

    /**
     * this setting email of the user
     * @param Email email of the user
     */
    public void setEmail(String Email){this.Email=Email;}

    /**
     * this setting id of the user
     * @param ID id of the user
     */
    public void setID(String ID){this.ID=ID;}

    /**
     * this setting password of the user
     * @param Password passeord of the user
     */
    public void setPassword(String Password){this.Password=Password;}

    /**
     * this setting the default location of the user
     * @param DefaultLocation default location of the user
     */
    public void setDefaultLocation(String DefaultLocation){this.DefaultLocation=DefaultLocation;}

    /**
     * parameterized constructor that sets these values from a user
     * @param Name name
     * @param Email email
     * @param ID id
     * @param Password password
     * @param DefaultLocation default location
     */
    public User(String Name,String Email,String ID,String Password,String DefaultLocation) {
        setName(Name);
        setEmail(Email);
        setID(ID);
        setPassword(Password);
        setDefaultLocation(DefaultLocation);
    }

    /**
     * this  getting the name of the user
     * @return name
     */
    public String getName(){return Name;}

    /**
     * this getting email of the user
     * @return email
     */
    public String getEmail(){return Email;}

    /**
     * this getting id of the user
     * @return id
     */
    public String getID(){return ID;}

    /**
     * this getting password of the user
     * @return password
     */
    public String getPassword(){return Password;}

    /**
     * this getting the default location of the user
     * @return default location
     */
    public String getDefaultLocation(){return DefaultLocation;}

    /**
     * this function for prints the information about the user
     * @return name, email , id , password , location
     */
    public String toString(){
        return ("Name: "+getName()+" , Email: " +getEmail()+ " , ID: " +getID()+
                " , Password: " +getPassword()+ " , Location: "+getDefaultLocation());
    }

    /**
     * this function to sign up to the application
     */
    public void SignUp()
    {
        System.out.print("Name:");
        String name = input.next();
        System.out.print("Email:");
        String email = input.next();
        System.out.print("ID:");
        String id = input.next();
        System.out.print("Password:");
        String password = input.next();
        System.out.print("Default Location:");
        String location = input.next();
        User user = new User(name,email,id,password,location);
        System.out.println("User Has Been Added Successfully! \n" +user.toString());

    }

    /**
     * this fucntion to sign in the application
     */
    public void SignIn()
    {
        System.out.print("Email:");
        String email = input.next();
        setEmail(email);
        System.out.print("Password:");
        String password = input.next();
        setPassword(password);
        System.out.println("User Has Been Signed In Successfully! Welcome");
    }

}
