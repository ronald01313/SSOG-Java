
package Controller;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class StudentPrintGrades {
    
    public void printGrades(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("     Print Summary of Grades");
        System.out.println("==============================");
        System.out.println("                              ");
        System.out.print("Please Enter Your Student Number: ");
        String studentNumber = scanner.nextLine();
        System.out.print("Please Enter Your Full Name: ");
        String fullName = scanner.nextLine();
    
    }
    
}
