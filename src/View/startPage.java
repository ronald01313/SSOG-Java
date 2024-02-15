
package View;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class startPage {
    
    
    Scanner input = new Scanner(System.in);
    student studentInstance = new student();
    admin adminInstance = new admin();
    //clearScreen clearScreenExe = new clearScreen();
 
    
    public void run(){
        
        
        
        System.out.println("===================================");
        System.out.println("    STUDENT SUMMARRY OF GRADES");
        System.out.println("===================================");
        System.out.println("    [1] Student");
        System.out.println("    [2] Admin/Registrar");
        System.out.println("    [0] EXIT");
        System.out.println("*************************************");
        
        System.out.println("                        ");
       
      
        System.out.print("Enter User Type: "); 
        int ut = input.nextInt();
        System.out.println("-------------------------------------");
       
        
         switch (ut){
            case 1:
                //System.out.println("Student");
                studentInstance.studentPortal();
                break;
            case 2:
                //System.out.println("Admin");
                adminInstance.adminPortal();
                break;
            case 0:
                System.out.println("          Thank You!!!");
                System.exit(0);
                break;      
            default:
                System.out.println("Invalid User type");
                
                run();
                System.out.println("----------------------------------");
        }
         
    }
}
        
            
        
        
     
 