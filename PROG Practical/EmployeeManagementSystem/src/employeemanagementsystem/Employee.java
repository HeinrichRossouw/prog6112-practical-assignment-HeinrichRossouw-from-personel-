/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author hein2
 */
public class Employee {
    private String id;
    private String name;
    private String department;
    private double baseSalary;  
    
    public Employee(String id, String name, String department, double baseSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    
    public double getbaseSalary(){
        return baseSalary;
    }
    
    public String getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setSalary(double Salary){
        baseSalary = Salary;
    }
    
    public void setDepartment(String newDepartment){
        department = newDepartment;
    }
    
    public String displayInfo() {
        return ("\n\nID: " + id + "\nName: " + name + "\nDepartment: " + department + "\nSalary: R" + getbaseSalary());
    }
}

