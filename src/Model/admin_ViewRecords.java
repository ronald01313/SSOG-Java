
package Model;

import Controller.Declaration;
import java.sql.*;

/**
 *
 * @author Ronald
 */
public class admin_ViewRecords extends Declaration {
    
    public void viewRecords() {
        
        try{
            conn = DriverManager.getConnection(dbname);
            qry = "SELECT * FROM STUDENT_INFO";
            stmnt = conn.createStatement();
            rslt = stmnt.executeQuery(qry);
            while(rslt.next()){
                uid = rslt.getInt("STUDENT_ID");
                st_Number = rslt.getString("STUDENT_NUMBER");
                fname = rslt.getString("STUDENT_FIRSTNAME");
                mname = rslt.getString("STUDENT_MIDDLENAME");
                lname = rslt.getString("STUDENT_LASTNAME");
                subject = rslt.getString("SUBJECT");
                grades = rslt.getString("GRADE");
              
                System.out.println("-------------------------------------------------------");
                System.out.println("Student ID: " + uid);
                System.out.println("Student Number: " + st_Number);
                System.out.println("Fullname: " + lname + ", " + fname + " " + mname.charAt(0) + ".");
                System.out.println("Subject Code: " + subject);
                System.out.println("Grade: " + grades);
                System.out.println("-------------------------------------------------------");
            }
           // StartPage start = new StartPage();
            //start.execute();
        }catch(Exception a){
            a.printStackTrace();
        }
    }
    public void viewSpecific(){
        System.out.print("Enter Lastname: "); search = input.nextLine();
        try{
            conn = DriverManager.getConnection(dbname);
            qry = "Select * from STUDENT_INFO where lastname like '%" + search + "%'";
            stmnt = conn.createStatement();
            rslt = stmnt.executeQuery(qry);
            while(rslt.next()){
                uid = rslt.getInt("STUDENT_ID");
                st_Number = rslt.getString("STUDENT_NUMBER");
                fname = rslt.getString("STUDENT_FIRSTNAME");
                mname = rslt.getString("STUDENT_MIDDLENAME");
                lname = rslt.getString("STUDENT_LASTNAME");
                subject = rslt.getString("SUBJECT");
                grades = rslt.getString("GRADE");
              
               System.out.println("-------------------------------------------------------");
                System.out.println("Student ID: " + uid);
                System.out.println("Student Number: " + st_Number);
                System.out.println("Fullname: " + lname + ", " + fname + " " + mname.charAt(0) + ".");
                System.out.println("Subject Code: " + subject);
                System.out.println("Grade: " + grades);
                System.out.println("-------------------------------------------------------");
            }
            //StartPage start = new StartPage();
            //start.execute();
        }
        catch(Exception a){
            a.printStackTrace();
        }
    
    
    }
    
}
