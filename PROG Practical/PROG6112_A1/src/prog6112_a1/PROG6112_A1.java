
package prog6112_a1;
import java.util.*;


public class PROG6112_A1 {

    public static void main(String[] args) {
        
        Student managedetails = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("STUDENT MANAGEMENT APPLICATION"+ "\n************************************************");
        
        while(true){//looping to continously show the program until the user decides to end the application
            System.out.println("Enter (1) to launch menu or any other key to exit");
            String launch = input.nextLine();
            if(launch.equals("1")){//checking if the user wants to launch the menu
                
                //providing options for the user to choose
                System.out.println("Please select one of the following menu items:"+
                        "\n1. Capture a new student"+
                        "\n2. Search for a student"+
                        "\n3. Delete a student"+ 
                        "\n4. Print student report"+
                        "\n5. Exit Application");
                
                boolean Digit = true;
                String choice = input.nextLine();
                for(char c: choice.toCharArray()){//error handling in case a number is not entered
                    if(Character.isDigit(c)){
                        Digit = true;
                    }
                    else{
                        Digit = false;
                        break;
                    }
                    
                }
                
                if(Digit == false){
                    System.out.println("Please enter a number");
                }
                else{
                    
                    int ichoice = Integer.parseInt(choice);
                    if(ichoice == 1){//taking a students details
                        System.out.println("CAPTURE A NEW STUDENT\n********************************"+
                                "\nEnter the student id:");
                        String studentid = input.nextLine();
                        
                        System.out.println("Enter the student name:");
                        String studentname = input.nextLine();
                        
                        String studentage = "";
                        int istudentage= 0;
                        while(istudentage< 16){//checking whether they fit the criteria for being a student
                            System.out.println("Enter the student age:");
                            studentage = input.nextLine();
                            try{//error handling in the case of where a number is not entered
                                istudentage = Integer.parseInt(studentage);
                            }
                            catch(Exception e){
                                System.out.println("Please enter a number");
                            }
                        }
                        
                        System.out.println("Enter the student email:");
                        String studentemail = input.nextLine();
                        
                        System.out.println("Enter the student course");
                        String studentcourse = input.nextLine();
                        
                        System.out.println(managedetails.SaveStudent(studentname, studentage, studentid, studentemail, studentcourse));
                        //providing confirmation of the results
                    }
                    else if(ichoice ==2){
                        //searching for a student using their student id
                        System.out.println("Enter the student id you wish to search for:");
                        String studentID =input.nextLine();
                        System.out.println(managedetails.SearchStudent(studentID));
                        
                    }
                    else if(ichoice ==3){
                        //deleting a student using their student id
                        System.out.println("Enter the student id you wish to delete:");
                        String studentID =input.nextLine();
                        System.out.println(managedetails.DeleteStudent(studentID));
                        
                        
                    }
                    else if(ichoice ==4){
                        //making a report displaying all the students information
                        System.out.println(managedetails.StudentReport());
                    }
                    else if(ichoice==5){
                        //exiting the application
                        managedetails.ExitStudentApplication();
                    }
                    else{
                        //in the case none of the options were chosen
                    }
                    
                }
                
            }
            else{
                managedetails.ExitStudentApplication();
            }
        }
    }
    
}
