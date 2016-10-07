/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neko
 */
import org.joda.time.*;

public class Student {
     // Name, Age, DOB, ID, username
   
 private  String name;
 private  int age;
 private  int id;
 static int sIDS = 0;
 private  DateTime dob;
 private  String username;
  
   // This is the constructor of the class Student
   public Student(String name, int age, DateTime dob) {
      this.name = name;
      this.age = age;
      this.id = sIDS++;
      this.dob = dob;
      this.setStudentUsername();
   }

   // Assign the age of the Student  to the variable age.
   public void setAge(int sAge) {
      age = sAge;
   }
   
   public void setID (int sId) {
      id = sId;
   }

   /* Assign the dob to the variable dob.*/
   public void setStudentDOB(DateTime sdob) {
      dob = sdob;
   }

   /* Assign the username*/
   public void setStudentUsername() {
      String theUserName = this.name;
      theUserName = theUserName + Integer.toString(this.age);      
      this.username = theUserName;
   }
   
    public int getAge() 
    {
        return age;
    }

    public DateTime getDob() 
    {
        return dob;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getUsername() 
    {
        return username;
    }
    
}
