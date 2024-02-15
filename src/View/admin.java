
package View;

import java.util.Scanner;
import Model.admin_AddRecords;
import Model.admin_DeleteRecords;
import Model.admin_ViewRecords;
import Model.admin_UpdateRecords;
/**
 *
 * @author Ronald
 */
public class admin {
    
     public void adminPortal() {
         
        Scanner input = new Scanner(System.in);
        admin_Previous back = new admin_Previous();
        admin_AddRecords addRecords = new admin_AddRecords(); 
        admin_ViewRecords viewRecords = new admin_ViewRecords();
        admin_UpdateRecords updateRecords = new admin_UpdateRecords();
        admin_DeleteRecords deleteRecords = new admin_DeleteRecords();
        
        System.out.println("===================================");
        System.out.println("        ADMIN PORTAL");
        System.out.println("===================================");
        System.out.println("     [1] Insert Student Data");
        System.out.println("     [2] Update ");
        System.out.println("     [3] View Student Records ");
        System.out.println("     [4] Delete Student Data ");
        System.out.println("     [0] Exit ");
         
        System.out.println("*************************************");
        System.out.println("                        ");
        
        System.out.print("Enter what to transact: "); 
        int transact = input.nextInt();
        System.out.println("-------------------------------------");
        
        
        switch (transact) {
            
             case 1:
                System.out.println("Insert Student Data");
                addRecords.insertStudentData();
                break;
            case 2:
                System.out.println("Update Data");
                updateRecords.updateStudentData();
                break;
            case 3:
                System.out.println("View Student Records");
                viewRecords.viewRecords();
                break;
            case 4:
                System.out.println("Delete Student Data");
                deleteRecords.deleteStudentData();
                break;   
            case 0:
                System.out.println("          Thank You!!!");
                System.exit(0);
                break;   
            default:
                System.out.println("Invalid User type");
                adminPortal();
                System.out.println("----------------------------------");
        
        }
        
         back.adminExecute();
        
     }

   
}
    

