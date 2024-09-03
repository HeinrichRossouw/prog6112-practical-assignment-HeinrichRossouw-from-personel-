/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package employeemanagementsystem;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hein2
 */
public class EmployeeListTest {
    EmployeeList el = new EmployeeList();
    public EmployeeListTest() {
    }

    @Test
    public void testAddFullTimeEmployee() {
        assertEquals("Full Time Employee's details saved",el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0));
    }

    @Test
    public void testAddPartTimeEmployee() {
        assertEquals("Part Time Employee's details saved",el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23));
    }

    @Test
    public void testAddIntern() {
        assertEquals("Intern's details saved",el.addIntern("11","11","General Work Force", 9000));
    }

    @Test
    public void testRemoveIntern() {
    el.addIntern("11","11","General Work Force", 9000);
    el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
    el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
    
    assertEquals("Intern 11 has been removed",el.removeIntern("11"));
    }
    
    @Test
    public void testnotFoundRemoveIntern() {
    el.addIntern("11","11","General Work Force", 9000);
    el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
    el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
    
    assertEquals("Intern 12 could not be found",el.removeIntern("12"));
    }

    @Test
    public void testRemoveFullTime() {
        el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Full Time Employee 11 has been removed",el.removeFullTime("11"));
    }

    @Test
    public void testnotFoundRemoveFullTime() {
        el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Full Time Employee 12 could not be found",el.removeFullTime("12"));
    }

    @Test
    public void testRemovePartTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Part Time Employee 11 has been removed",el.removePartTime("11"));
    }
    
    @Test
    public void testnotFoundRemovePartTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Part Time Employee 12 could not be found",el.removePartTime("12"));
    }

    @Test
    public void testListofInterns() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("\n\nID: 11\nName: 11\nDepartment: General Work Force\nSalary: R9000.0",el.ListofInterns());
    }

    @Test
    public void testListofFullTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("\n\nID: 11\nName: 11\nDepartment: General Work Force\nSalary: R1000.0",el.ListofFullTime());
    
    }

    @Test
    public void testListofPartTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        double moneydue = 50 *23;
        
        assertEquals("\n\nID: 11\nName: 11\nDepartment: General Work Force\nSalary: R"+String.valueOf(moneydue),el.ListofPartTime());
    
    }

    @Test
    public void testSearchforWorker() { 
        el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("\n\nID: 11\nName: 11\nDepartment: General Work Force\nSalary: R9000.0\nType of Worker: Intern",el.SearchforWorker("11"));
    }

    @Test
    public void testnotFoundSearchforWorker() { 
        el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Employee 12 not found",el.SearchforWorker("12"));
    }

    @Test
    public void testPromotionPartTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Employee 11 has been promoted to a Full Time Employee",el.PromotionPartTime("11", "General Work Force"));
    }

    @Test
    public void testnotFoundPromotionPartTime() {
         el.addIntern("11","11","General Work Force", 9000);
        el.addFullTimeEmployee("11", "11", "General Work Force", 1000, 0);
        el.addPartTimeEmployee("11", "11", "General Work Force", 50, 23);
        
        assertEquals("Employee 12 not found",el.PromotionPartTime("12", "General Work Force"));
    }

}
