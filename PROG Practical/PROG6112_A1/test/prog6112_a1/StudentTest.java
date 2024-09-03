
package prog6112_a1;

import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {
    Student details = new Student();
    public StudentTest() {
    }

    @Test
    public void testSaveStudent() {
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        assertEquals(details.SaveStudent("Heinrich", "24", "1111", "heinrich@gmail.com", "disc"),"Student successfully saved");
    }

    @Test
    public void testSuccessfulSearchStudent() {
        
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        
        details.studentID.add("1111");
        details.studentage.add("24");
        details.studentcourse.add("disc");
        details.studentemail.add("heinrich@gmail.com");
        details.studentname.add("Heinrich");
        
        assertEquals(details.SearchStudent("1111"), "-----------------------------------------------------------"+
                   "\nSTUDENT ID: 1111"+
                   "\nSTUDENT NAME: Heinrich"+
                   "\nSTUDENT AGE: 24"+ 
                   "\nSTUDENT EMAIL: heinrich@gmail.com"+
                   "\nSTUDENT COURSE: disc"+ 
                    "\n------------------------------------------------------------");
       
    }
    
    @Test
    public void testnotfoundSearchStudent() {
        
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        
        details.studentID.add("1111");
        details.studentage.add("24");
        details.studentcourse.add("disc");
        details.studentemail.add("heinrich@gmail.com");
        details.studentname.add("Heinrich");
        
        assertEquals(details.SearchStudent("111"),"Student 111 not found");
    }

    @Test
    public void testSuccessfulDeleteStudent() {
        
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        
        details.studentID.add("1111");
        details.studentage.add("24");
        details.studentcourse.add("disc");
        details.studentemail.add("heinrich@gmail.com");
        details.studentname.add("Heinrich");
        
        assertEquals(details.DeleteStudent("1111"),"Student 1111 sucessfully deleted");
    }
    
    @Test
    public void testnotFoundDeleteStudent() {
        
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        
        details.studentID.add("1111");
        details.studentage.add("24");
        details.studentcourse.add("disc");
        details.studentemail.add("heinrich@gmail.com");
        details.studentname.add("Heinrich");
        
        assertEquals(details.DeleteStudent("111"),"Student 111 not found");
    }

    @Test
    public void testStudentReport() {
        
        details.studentID.clear();
        details.studentage.clear();
        details.studentcourse.clear();
        details.studentemail.clear();
        details.studentname.clear();
        
        details.studentID.add("1111");
        details.studentage.add("24");
        details.studentcourse.add("disc");
        details.studentemail.add("heinrich@gmail.com");
        details.studentname.add("Heinrich");
        
        assertEquals(details.StudentReport(),"\nSTUDENT 1"+"\n-----------------------------------------------------------"+
                   "\nSTUDENT ID: 1111"+
                   "\nSTUDENT NAME: Heinrich"+
                   "\nSTUDENT AGE: 24"+ 
                   "\nSTUDENT EMAIL: heinrich@gmail.com"+
                   "\nSTUDENT COURSE: disc"+ 
                    "\n------------------------------------------------------------");
        
    }
    
}
