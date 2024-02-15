package View;

import java.util.Scanner;
import Controller.StudentViewGrades;
import Controller.StudentPrintGrades;
import Model.st_ViewGrades;

/**
 * author Ronald
 */
public class student {

    public void studentPortal() {

        Scanner input = new Scanner(System.in);
        startPage start = new startPage();
        st_ViewGrades stViewGrades = new st_ViewGrades();
        StudentPrintGrades stPrintGrades = new StudentPrintGrades();
        backToPrev back = new backToPrev();

        System.out.println("===================================");
        System.out.println("        STUDENT PORTAL");
        System.out.println("===================================");
        System.out.println("    [1] View Grades");
        System.out.println("    [2] Print Grades ");
        System.out.println("    [0] Exit ");
        System.out.println("*************************************");
        System.out.println("                        ");

        System.out.print("Enter what to transact: ");
        int transact = input.nextInt();
        System.out.println("-------------------------------------");

        switch (transact) {
            case 1:
                System.out.println("View Your Grades");
                stViewGrades.viewStudentGrades();
                break;
            case 2:
                System.out.println("Print Summary of Grades");
                stPrintGrades.printGrades();
                break;
            case 0:
                System.out.println("           Thank You!!!");
                start.run();
                break;
               
            default:
                System.out.println("Invalid User type");
                studentPortal();
                System.out.println("----------------------------------");

           
        }
        
        back.execute();
    }
}


  

     
        
