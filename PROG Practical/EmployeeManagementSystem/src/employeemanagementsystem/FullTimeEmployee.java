/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author hein2
 */
public class FullTimeEmployee extends Employee{
    private double bonusmultiplier = 0.2;
    private double bonus;
    private int overtimehours;
    private double overtime;
    
    
    public FullTimeEmployee(String id, String name, String department, double baseSalary, int overtimehrs) {
        super(id, name, department, baseSalary);
        this.bonus = (bonusmultiplier*baseSalary);
        this.overtime = overtimehrs *( 0.75*baseSalary);
    }
    
    public double getBonusTotal(){
        return super.getbaseSalary() + bonus;
    }
    
    public int getOvertimeHours(){
        return overtimehours;
    }
    
    public double getOvertimePay(){
        return overtime;
    }
}

