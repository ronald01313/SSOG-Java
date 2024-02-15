package Model;

import Controller.Declaration;
import java.sql.*;

public class admin_AddRecords extends Declaration {

    public void insertStudentData() {
        try{
            conn = DriverManager.getConnection(dbname);
            qry = "select STUDENT_ID from STUDENT_INFO order by STUDENT_ID desc fetch first 1 rows only";
            stmnt = conn.createStatement();
            rslt = stmnt.executeQuery(qry);
            if(rslt.next()){
                uid = rslt.getInt("STUDENT_ID");
                uid++;
                System.out.println("STUDENT_ID: " + uid);
            }
        }
        catch(SQLException a){
            a.printStackTrace();
        }
         System.out.print("Student Number: "); st_Number = input.nextLine();
        System.out.print("First name: "); fname = input.nextLine();
        System.out.print("Middle name: "); mname = input.nextLine();
        System.out.print("Last name: "); lname = input.nextLine();
        System.out.print("Subject Code: "); subject = input.nextLine();
        System.out.print("Grade: "); grades = input.nextLine();
       
        //insertID();
        try{
            conn = DriverManager.getConnection(dbname);
           qry = "INSERT INTO STUDENT_INFO VALUES (?, ?, ?, ?, ?, ?, ?)";
            pstmnt = conn.prepareStatement(qry);
            pstmnt.setInt(1, uid);
            pstmnt.setString(2, st_Number);
            pstmnt.setString(3, subject);
            pstmnt.setString(4, grades);
            pstmnt.setString(5, fname);
            pstmnt.setString(6, mname);
            pstmnt.setString(7, lname);
            pstmnt.executeUpdate();
            System.out.println("Data successfully inserted");
            System.out.println("------------------------------------------------------");
            //StartPage start = new StartPage();
            //start.execute();
        }
        catch(SQLException a){
            a.printStackTrace();
            System.out.println("Wrong inputs!!!");
        }
    }

    public void insertID(){
        try{
            conn = DriverManager.getConnection(dbname);
            qry = uid + "insert into STUDENT_INFO values (" + ")";
            pstmnt = conn.prepareStatement(qry);
            pstmnt.executeUpdate();
        }catch(Exception a){
           a.printStackTrace();
        }
    }
}