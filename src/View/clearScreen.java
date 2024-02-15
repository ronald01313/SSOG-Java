
package View;

/**
 *
 * @author Ronald
 */
public class clearScreen {
        
         public void clearScreen() {
		 System.out.print("\033[H\033[2J");
        System.out.flush();

        try {
            // Pause for a short time to allow NetBeans to clear the output window
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         }
    
}
