package grosspaycalculator;
import java.util.Scanner;

import org.w3c.dom.html.HTMLQuoteElement;

public class GrossPayCalculator {

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        String name;
        char type;
        double monthlySalary, rate, salary, overtimePay, parSalary;
        int hoursWorked, overtime;
        
        System.out.print("ENTER EMPLOYEE NAME: ");
        name = scan.nextLine();
        System.out.print("PRESS F FOR FULL TIME OR P FOR PART TIME: ");
        type = scan.next().charAt(0);
        
        if ( type == 'F' ) {
            System.out.println("--- FULL TIME EMPLOYMENT ---");
            System.out.print("ENTER BASIC PAY: ");
            monthlySalary = scan.nextDouble();
            System.out.println("____________________________________");
            System.out.println("EMPLOYEE NAME:    " + name);
            System.out.println("BASIC PAY:        " + monthlySalary);
            System.out.println("____________________________________");
            System.out.println("GROSS PAY:        " + monthlySalary);
        } else if ( type == 'P' ) {
            System.out.println("--- PART TIME EMPLOYMENT ---");
            System.out.print("ENTER RATE PER HOUR: ");
            rate = scan.nextDouble();
            System.out.print("ENTER NO. OF HOURS WORKED: ");
            hoursWorked = scan.nextInt();
            System.out.print("ENTER NO. OF OVERTIME: ");
            overtime = scan.nextInt();
            
            parSalary = rate * hoursWorked;
            overtimePay = overtime * (rate * 1.25);
            salary = overtimePay + parSalary;
            
            System.out.println("____________________________________");
            System.out.println("EMPOLOYEE NAME:    " + name);
            System.out.println("BASIC PAY:        " + parSalary);
            System.out.println("OVERTIME PAY:     " + overtimePay);
            System.out.println("____________________________________");
            System.out.println("GROSS PAY:        " + salary);
        } else{
            System.out.println("INVALID TYPE OF EMPLOYMENT");
        }
    }
}
