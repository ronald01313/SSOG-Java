
package Model;

import Controller.Declaration;
import java.sql.*;

/**
 *
 * @author Ronald
 */
public class admin_UpdateRecords extends Declaration {
    
    public void updateStudentData() {
    try {
        // Collect the unique identifier (STUDENT_ID) for the student you want to update
        System.out.print("Enter STUDENT_ID to update: ");
        int studentIdToUpdate = input.nextInt();
        
        // Collect the new values for Subject_Code and Grade
        System.out.print("New Subject Code: ");
        String newSubject = input.next();
        
        System.out.print("New Grade: ");
        String newGrade = input.next();

        // Update the database
        conn = DriverManager.getConnection(dbname);
        qry = "UPDATE STUDENT_INFO SET SUBJECT=?, Grade=? WHERE STUDENT_ID=?";
        pstmnt = conn.prepareStatement(qry);
        pstmnt.setString(1, newSubject);
        pstmnt.setString(2, newGrade);
        pstmnt.setInt(3, studentIdToUpdate);
        int rowsUpdated = pstmnt.executeUpdate();

        if (rowsUpdated > 0) {
            System.out.println("Data successfully updated");
            System.out.println("------------------------------------------------------");
        } else {
            System.out.println("No student found with STUDENT_ID: " + studentIdToUpdate);
        }
    } catch (SQLException a) {
        a.printStackTrace();
        System.out.println("Error updating data");
    }
}

    
}
