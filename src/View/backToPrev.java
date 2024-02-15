
package View;

import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class backToPrev {
    
    public void execute() {

            Scanner input = new Scanner(System.in);
            student portal = new student();
            

            System.out.print("Do you want to have another transaction? [Y/N]: ");
            String opt = input.nextLine();
            System.out.println("------------------------------------------------------");
            if (opt.equalsIgnoreCase("y")) {
                portal.studentPortal();
            } else if (opt.equalsIgnoreCase("n")) {
                System.out.println("Thank You!!!");
                System.exit(0);
            } else {
                System.out.println("Invalid answer");
                execute();
                System.out.println("------------------------------------------------------");
            }
        }

   

    
}
