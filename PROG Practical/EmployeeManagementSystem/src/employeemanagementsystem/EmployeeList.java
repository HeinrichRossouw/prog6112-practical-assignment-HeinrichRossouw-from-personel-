/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;
import java.util.*;
/**
 *
 * @author hein2
 */
public class EmployeeList {
    public ArrayList<Intern> listinterns = new ArrayList<>();
    public ArrayList<PartTimeEmployee> pte = new ArrayList<>();
    public ArrayList<FullTimeEmployee>  fte = new ArrayList<>();
    
    /*
    Topic ArrayList of Objects
    Source: GeeksForGeeks
    Available at: https://www.geeksforgeeks.org/how-objects-can-an-arraylist-hold-in-java/
    [Accessed on 02 September]
    */
    
    public String addFullTimeEmployee(String id, String name, String department, double baseSalary, int overtimehrs){
        String output = "";
        try{//error handling
        FullTimeEmployee newFullTime = new FullTimeEmployee(id,name,department,baseSalary,overtimehrs);
        fte.add(newFullTime);
        output = "Full Time Employee's details saved";
        }
        catch(Exception e){
            output = "Error. Please ensure the correct info is provided";
        }
        return output; 
    }
    
    public String addPartTimeEmployee(String id,String name, String department, int hoursworked, double hourlyrate){
        String output = "";
        try{//error handling
            PartTimeEmployee newPartTime = new PartTimeEmployee(id, name, department, hoursworked, hourlyrate);
            pte.add(newPartTime);
            output = "Part Time Employee's details saved";
            
        }
        catch(Exception e){
            output = "Error. Please ensure the correct info is provided";
        }
        return output;
    }
    
    public String addIntern(String id, String name, String department, double baseSalary){
        String output = "";
        try{//error handling
            Intern newIntern = new Intern(id,name,department,baseSalary);
            listinterns.add(newIntern);
            output = "Intern's details saved";
        }
        catch(Exception e){
             output = "Error. Please ensure the correct info is provided";
        }
        return output;
    }
    
    public String removeIntern(String name){
        String output = "";
        boolean found = false;
        int i= -1;
        for( i = 0; i < listinterns.size();i++){//searching for the intern that is provided as the arguement
            if(listinterns.get(i).getName().equals(name)){
                found = true;//getting the index
                break;
            }
        }
        if(found == true){
            listinterns.remove(i);
            output = "Intern "+ name + " has been removed";//if its found it is removed
        }
        else{
            output = "Intern "+name+" could not be found";//if it isnt found its removed
        }
        return output;
        
    }
    
    public String removeFullTime(String name){
        String output = "";
        boolean found = false;
        int i =-1;
        for ( i = 0; i < fte.size(); i++) {//searching for the employee
            if(fte.get(i).getName().equals(name)){
                found = true;//getting the index
                break;
                
            }
        }
        if(found == true){
            fte.remove(i);
            output = "Full Time Employee "+ name+ " has been removed";//if the employee is found it is removed
        }
        else{
            output = "Full Time Employee "+ name+ " could not be found";//if the employee is not found a corresponding String is returned
        }
        return output;
    }
    
    public String removePartTime(String name){
        String output = "";
        boolean found = false;
        int i=-1;
        for(i =0; i< pte.size();i++){//searching for the designated employee
            if(pte.get(i).getName().equals(name)){
                found = true;//getting the index
                break;
            }
        }
        if (found == true){
            pte.remove(i);
            output = "Part Time Employee "+ name+" has been removed";//removing the employee if its found
            
        }
        else{
            output = "Part Time Employee "+ name+ " could not be found";//displaying a corresponding message if the employee is not found
        }
        return output;
    }
    
    public String ListofInterns(){
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < listinterns.size(); i++) {//looping through the array of interns to display each of the employees info
            list.append(listinterns.get(i).displayInfo());
            
        }
        return list.toString();
    }
    
    public String ListofFullTime(){
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < fte.size(); i++) {//looping through the array of full time employees to display each of the employees info
            list.append(fte.get(i).displayInfo());
            
        }
        return list.toString();
    }
    
    public String ListofPartTime(){
        StringBuilder list = new StringBuilder();
        for (int i = 0; i < pte.size(); i++) {//looping through the array of part time employees to display each of the employees info
            list.append(pte.get(i).displayInfo());
            
        }
        return list.toString();
    
    }
    
    public String SearchforWorker(String name){
        StringBuilder list = new StringBuilder();
        boolean found = false;
        for (int i = 0; i < listinterns.size(); i++) {//searching for the worker in all three arraylists( for Interns, Full Time and Part Time Employees
            if(listinterns.get(i).getName().equals(name)){
                list.append(listinterns.get(i).displayInfo()+"\nType of Worker: Intern");
                found = true;
                break;
            }
        }
        if(found == true){
            return list.toString();
        }
        else{
            for (int i = 0; i < fte.size(); i++) {
                if(fte.get(i).getName().equals(name)){
                    list.append(fte.get(i).displayInfo()+ "\nType of Worker: Full Time Employee");
                    found = true;
                    break;
                }
                
            }
            if(found == true){
                return list.toString();
            }
            else{
                for (int i = 0; i < pte.size(); i++) {
                    if(pte.get(i).getName().equals(name)){
                        list.append(pte.get(i).displayInfo()+ "\nType of Worker: Part Time Employee");
                        found = true;
                    }
                    
                }
                if(found ==true){
                    return list.toString();
                }
                else{
                    return "Employee "+ name+ " not found";
                }
            }
        }
        
    }
    
    public String PromotionPartTime(String name,String Department){
        int i=-1;
        boolean found =false;
        for ( i = 0; i < pte.size(); i++) {//searching for the part time employee to promote
            if(pte.get(i).getName().equals(name)){
                found = true;
                break;
            }
            
        }
        if(found ==true){
            //once the employee is found its details are changed from that of a part time employee to a full time employee
            FullTimeEmployee promotedemployee = new FullTimeEmployee(pte.get(i).getID(),pte.get(i).getName(),Department,pte.get(i).getbaseSalary(),0);
           fte.add(promotedemployee);
           pte.remove(i);
           return "Employee "+ name+ " has been promoted to a Full Time Employee";
        }
        else{
            return "Employee "+ name+ " not found";
        }
    }
}

