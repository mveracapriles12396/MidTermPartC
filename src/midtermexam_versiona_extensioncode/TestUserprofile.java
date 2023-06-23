/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author karla
 */
public class TestUserprofile {
    public static void main(String[] args){
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter your user name");
        String name = scanner.next();
        System.out.println("Enter your favorite gender you can choose between:");
        
        for (String gender : UserProfile.genres){
         System.out.println(gender);
        }
        String gender = scanner.next();
	UserProfile user = new  UserProfile(name, gender);
        System.out.println("userProfile was created! Your name is "+user.getUserID());
    }
}
