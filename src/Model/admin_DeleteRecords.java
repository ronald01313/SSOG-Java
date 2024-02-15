
package Model;

import Controller.Declaration;
import java.sql.*;

/**
 *
 * @author Ronald
 */
public class admin_DeleteRecords extends Declaration {
    
     public void deleteStudentData() {
        try {
            // Collect the unique identifier (STUDENT_ID) for the student you want to delete
            System.out.print("Enter STUDENT_ID to delete: ");
            int studentIdToDelete = input.nextInt();

            // Delete the corresponding row from the database
            conn = DriverManager.getConnection(dbname);
            qry = "DELETE FROM STUDENT_INFO WHERE STUDENT_ID=?";
            pstmnt = conn.prepareStatement(qry);
            pstmnt.setInt(1, studentIdToDelete);
            int rowsDeleted = pstmnt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Data for STUDENT_ID " + studentIdToDelete + " successfully deleted");

                // Update STUDENT_ID values to maintain order
                updateStudentIdOrder();

                System.out.println("STUDENT_ID values reordered");
                System.out.println("------------------------------------------------------");
            } else {
                System.out.println("No student found with STUDENT_ID: " + studentIdToDelete);
            }
        } catch (SQLException a) {
            a.printStackTrace();
            System.out.println("Error deleting data");
        }
    }

    private void updateStudentIdOrder() {
        try {
            // Update STUDENT_ID values to maintain order
            conn = DriverManager.getConnection(dbname);
            qry = "UPDATE STUDENT_INFO SET STUDENT_ID = STUDENT_ID";
            stmnt = conn.createStatement();
            stmnt.executeUpdate(qry);
        } catch (SQLException a) {
            a.printStackTrace();
            System.out.println("Error updating STUDENT_ID order");
        }
    }}
