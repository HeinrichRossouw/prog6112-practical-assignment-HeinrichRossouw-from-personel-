/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author hein2
 */
public class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, String department, int hoursWorked, double hourlyRate) {
        super(id, name, department, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        super.setSalary(this.calculateSalary());
        
    }
    
    
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    
    
}

