
package Model;

import Controller.Declaration;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ronald
 */
public class st_ViewGrades extends Declaration {
    
     public void viewStudentGrades() {
        try {
            // Collect student information for identification
            System.out.print("Enter your Last Name: ");
            String studentLastName = input.nextLine();
            
            System.out.print("Enter your Student Number: ");
            String studentNumber = input.nextLine();

            // Query to retrieve the grades based on the provided information
            conn = DriverManager.getConnection(dbname);
           qry = "SELECT * FROM STUDENT_INFO WHERE STUDENT_LASTNAME LIKE ? AND STUDENT_NUMBER LIKE ?";
            pstmnt = conn.prepareStatement(qry);
            pstmnt.setString(1, "%" + studentLastName + "%");
            pstmnt.setString(2, "%" + studentNumber + "%");
            rslt = pstmnt.executeQuery();

            if (rslt.next()) {
                // Display the student's information and grades
                 System.out.println("------------------------------------------------------");
                System.out.println("Student Summary of Grades");
                System.out.println("Student ID: " + rslt.getInt("STUDENT_ID"));
                System.out.println("Student Number: " + rslt.getString("STUDENT_NUMBER"));
                System.out.println("Subject Code: " + rslt.getString("SUBJECT"));
                System.out.println("Grade: " + rslt.getString("GRADE"));
                System.out.println("Student First Name: " + rslt.getString("STUDENT_FIRSTNAME"));
                System.out.println("Student Middle Name: " + rslt.getString("STUDENT_MIDDLENAME"));
                System.out.println("Student Last Name: " + rslt.getString("STUDENT_LASTNAME"));
                System.out.println("------------------------------------------------------");
            } else {
                System.out.println("No records found for the provided information.");
            }

        } catch (SQLException a) {
            a.printStackTrace();
            System.out.println("Error retrieving data");
        }
    }

    
}
