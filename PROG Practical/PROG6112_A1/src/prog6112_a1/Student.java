package prog6112_a1;
import java.util.*;

public class Student {
    
    ArrayList<String> studentname = new ArrayList<String>();
    ArrayList<String> studentage = new ArrayList<String>();
    ArrayList<String> studentID = new ArrayList<String>();
    ArrayList<String> studentemail = new ArrayList<String>();
    ArrayList<String> studentcourse = new ArrayList<String>();
    /*
     ArrayLists 
        Codehs
        Available at: https://codehs.com/tutorial/evelyn/arraylists-in-java
        Accessed on 22 August 2024
    */
    public String SaveStudent(String name, String age, String Id, String email, String course){
        //saving a students details
        try{//exception handling
        studentname.add(name);
        studentage.add(age);
        studentID.add(Id);
        studentemail.add(email);
        studentcourse.add(course);
        return "Student successfully saved";
        }
        catch(Exception e){
            return "Please try again. There was an error";
        }
    }
    
    public String SearchStudent(String StudentId){
        //Searching for a student based on their id
        
        String output = "";
        
        int index = studentID.indexOf(StudentId);
        if(index != -1){//displaying the students details if they are found
            output = "-----------------------------------------------------------"+
                   "\nSTUDENT ID: "+ StudentId+
                   "\nSTUDENT NAME: "+ studentname.get(index)+
                   "\nSTUDENT AGE: "+ studentage.get(index)+
                   "\nSTUDENT EMAIL: "+ studentemail.get(index)+
                   "\nSTUDENT COURSE: "+ studentcourse.get(index)+
                    "\n------------------------------------------------------------";
        }
        else{
            //what displays in the case that they are not found
            output ="Student "+ StudentId + " not found";
        }
        return output;
    }
    
    public String DeleteStudent(String StudentID){
        //Deleting a students details
        
        String output = "";
        
        int index = studentID.indexOf(StudentID);//finding the postion of the students details in the arrays
        if(index != -1){//deleting the info for that student
            studentname.remove(index);
            studentage.remove(index);
            studentemail.remove(index);
            studentcourse.remove(index);
            studentID.remove(index);
            output = "Student "+ StudentID + " sucessfully deleted";
        }
        else{
            //what is displayed if the student is not found
            output= "Student "+ StudentID + " not found";
        }
        
        return output;
    }
    
    public String StudentReport(){
        StringBuilder report = new StringBuilder();
        if(studentname.size() > 0){//if the arraylist is not empty 
            
        
            for (int index = 0; index < studentname.size(); index++) {
                //looping through the array to get each students details
                
                report.append("\nSTUDENT "+ String.valueOf(index+1));
                report.append("\n-----------------------------------------------------------"+
                       "\nSTUDENT ID: "+ studentID.get(index)+
                       "\nSTUDENT NAME: "+ studentname.get(index)+
                       "\nSTUDENT AGE: "+ studentage.get(index)+
                       "\nSTUDENT EMAIL: "+ studentemail.get(index)+
                       "\nSTUDENT COURSE: "+ studentcourse.get(index)+
                        "\n------------------------------------------------------------"); 
            }
        }
        else{
            //error handling for if no details are entered
            report.append("Please enter some student details first");
        }
        
        return report.toString();
    }

    public void ExitStudentApplication(){
        System.exit(0);
    }
}

