
package View;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class admin_Previous {
    
    public void adminExecute() {

            Scanner input = new Scanner(System.in);
            admin portal = new admin();
            

            System.out.print("Do you want to have another transaction? [Y/N]: ");
            String opt = input.nextLine();
            System.out.println("------------------------------------------------------");
            if (opt.equalsIgnoreCase("y")) {
                portal.adminPortal();
            } else if (opt.equalsIgnoreCase("n")) {
                System.out.println("Thank You!!!");
                System.exit(0);
            } else {
                System.out.println("Invalid answer");
                adminExecute();
                System.out.println("------------------------------------------------------");
            }
    
}
}
