
package Controller;
import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Ronald
 */
public class Declaration {
    
    public Connection conn;
    public PreparedStatement pstmnt;
    public Statement stmnt;
    public ResultSet rslt;
    public Scanner in = new Scanner(System.in);
    public Scanner input  = new Scanner(System.in);
    public String dbname = "jdbc:derby://localhost:1527/rhd_DB;user=admin_rhd;password=admin";
    public String qry,fname,mname,lname,st_Number,subject,grades, search,newValue,newMname,field;
    public int uid;
}

    

