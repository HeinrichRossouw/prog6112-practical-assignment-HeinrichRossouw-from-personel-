/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeemanagementsystem;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author hein2
 */
public class EmployeeManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmployeeList manageEmps = new EmployeeList();
        while(true){//choosing  function to carry out
            String choice = JOptionPane.showInputDialog(null,"Please choose one of the options below:"+
                    "\n1.Add a Full Time Employee"+
                    "\n2.Add a Part Time Employee"+
                    "\n3.Add an Intern"+
                    "\n4.Remove a Full Time Employee"+
                    "\n5.Remove a Part Time Employee"+
                    "\n6.Remove an Intern"+
                    "\n7.Search for an Employee"+
                    "\n8.List of Full Time Employees"+ 
                    "\n9.List of Part Time Employees"+
                    "\n10.List of Interns"+
                    "\n11.Promote a Part Timer"+
                    "\n12.Exit");
            
            if(choice.equals("1")){//adding a full time employee
                //getting the details to add a full time employee
                String id = JOptionPane.showInputDialog(null,"Enter the Employee id:");
                String name = JOptionPane.showInputDialog(null,"Enter the Employee's full name: ");
                boolean departmentchosen = false;
                String department = "";
                while(departmentchosen == false){
                    
                    String departmentchoice = JOptionPane.showInputDialog(null,"Which department are they from:"+
                            "\n1.Finance"+
                            "\n2.Human Resources"+
                            "\n3.Management"+
                            "\n4.General Work Force");
                    if(departmentchoice.equals("1")){
                        department ="Finance";
                        departmentchosen = true;
                    }
                    else if(departmentchoice.equals("2")){
                        department = "Human Resources";
                        departmentchosen = true;
                    }
                    else if(departmentchoice.equals("3")){
                        department = "Management";
                        departmentchosen = true;
                    }
                    else if(departmentchoice.equals("4")){
                        department = "General Work Force";
                        departmentchosen = true;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Please choose one of the options available");
                    }
                }
                String baseSalary = JOptionPane.showInputDialog(null,"Enter the base salary of the Employee:");
                double dBaseSalary = Double.parseDouble(baseSalary);
                String sOverTimehours = JOptionPane.showInputDialog(null,"Enter the amount of hours spent as overtime:");
                int overtimehrs = Integer.parseInt(sOverTimehours);
                JOptionPane.showMessageDialog(null,manageEmps.addFullTimeEmployee(id, name, department, dBaseSalary, overtimehrs));
            }
            else if(choice.equals("2")){//adding a part time employee
                //getting the necessary information for adding a part time employee
                String id = JOptionPane.showInputDialog(null,"Enter the Employee id:");
                String name = JOptionPane.showInputDialog(null,"Enter the Employee's full name: ");
                String sHoursworked = JOptionPane.showInputDialog(null,"How many hours are they expected to work:");
                int HoursWorked = Integer.parseInt(sHoursworked);
                JOptionPane.showMessageDialog(null,manageEmps.addPartTimeEmployee(id, name, "General Work Force", HoursWorked,22));
                
            }
            else if(choice.equals("3")){//adding an intern
                //getting the necessary information to add an intern
                String id = JOptionPane.showInputDialog(null,"Enter the Employee id:");
                String name = JOptionPane.showInputDialog(null,"Enter the Employee's full name: ");
                
                JOptionPane.showMessageDialog(null,manageEmps.addIntern(id, name, "General Work Force", 9000));
            }
            else if(choice.equals("4")){//removing a full time employee
                String name = JOptionPane.showInputDialog(null,"Enter the name of the Employee you wish to remove:");
                JOptionPane.showMessageDialog(null, manageEmps.removeFullTime(name));
            }
            else if(choice.equals("5")){//removing a part time employee
                String name = JOptionPane.showInputDialog(null,"Enter the name of the Employee you wish to remove:");
                JOptionPane.showMessageDialog(null, manageEmps.removePartTime(name));
                
            }
            else if(choice.equals("6")){//removing an intern
                String name = JOptionPane.showInputDialog(null,"Enter the name of the Employee you wish to remove:");
                JOptionPane.showMessageDialog(null, manageEmps.removeIntern(name));
                
            }
            else if(choice.equals("7")){//searching for an employee
                
                String name = JOptionPane.showInputDialog(null,"Enter the name of the Employee you wish to search for:");
                JOptionPane.showMessageDialog(null, manageEmps.SearchforWorker(name));
            }
            else if(choice.equals("8")){//List of full time employees
                if(manageEmps.ListofFullTime().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter a Full Time Employee's details first");
                }
                else{
                JOptionPane.showMessageDialog(null,manageEmps.ListofFullTime());
                }
            }
            else if(choice.equals("9")){//list of part time employees
                if(manageEmps.ListofPartTime().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter a Part Time Employee's details first");
                }
                else{
                    JOptionPane.showMessageDialog(null,manageEmps.ListofPartTime());
                }    
            }
            
            else if(choice.equals("10")){//list of interns
                if(manageEmps.ListofInterns().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter an Intern's details first");
                }
                else{
                    JOptionPane.showMessageDialog(null,manageEmps.ListofInterns());
                }
            }
            else if(choice.equals("11")){//promote a part timer
                //getting the details for the promotion of the part time employee
                String name = JOptionPane.showInputDialog(null,"Enter the name of the Employee you wish to promote:");
                boolean found = false;
                String department ="";
                while(found == false){
                    String departmentchoice =JOptionPane.showInputDialog(null,"Enter the option for which department you want to put them in(number only):"+
                            "\n1.Finance"+
                            "\n2.Human Resources"+
                            "\n3.Management"+
                            "\n4.General Work Force");
                    if(departmentchoice.equals( "1")){
                        department = "Finnance";
                        found =true;
                    }
                    else if(departmentchoice.equals( "2")){
                        department ="Human Resources";
                        found = true;
                    }
                    else if(departmentchoice.equals( "3")){
                        department = "Management";
                        found = true;
                    }
                    else if(departmentchoice.equals("4")){
                        department = "Generla Work Force";
                        found = true;
                    }
                    else{
                        found = false;
                    }
                } 
                JOptionPane.showMessageDialog(null, manageEmps.PromotionPartTime(name,department));
                
            }
            else if(choice.equals("12")){//exit
                System.exit(0);
            }
            else{//in case no options are chosen
                JOptionPane.showMessageDialog(null,"Please select one of the options");
            }
        }
    }
    
}

    

