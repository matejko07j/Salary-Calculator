/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SalaryCalculator;
import java.util.*;

/**
 *
 * @author Jakub.Matejko
 */
        public class SalaryCalculator {
        public static void main(String[] args) {
        
        System.out.println("Input mumber of hours worked: ");
        Scanner hours  = new Scanner(System.in); //user input hours
        
        double hrswrk = hours.nextInt();
        double strdwage = 8.50;
        int weekhours = 40;
        double wage;
        double overtime = 4.25;
        
        if (hrswrk > 40)
            wage = (strdwage * hrswrk)
                 + (hrswrk - weekhours) * overtime;
        else if (hrswrk < 40)
            wage = strdwage * hrswrk;   
        else 
            wage = strdwage * weekhours;
        
        double extra; //calculate extra income
        extra = wage - weekhours * strdwage; //extra income
        double tax;
        tax = wage * 0.20; //calculate what 20% is
        double newwage;
        newwage = wage - tax; //takes away that 20% and gives new wage.
        
        System.out.println("Your total salary of the week is: £" + wage);
        System.out.println("That`s extra: £" + extra);

        
    //decission    
    System.out.print("Would you like to take tax off? Yes/No");
    Scanner taxin = new Scanner(System.in);
    //store user input as a String
    String taxdecission = taxin.nextLine();
    //check what user input is
    if(taxdecission.equalsIgnoreCase("yes")){
        System.out.println("[TAX Salary is:] " + newwage);
        //do you code when he exercises
    }
    else{
        System.out.println("Cool - Tax fraud it is then.");
    }
    }
}
