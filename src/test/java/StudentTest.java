/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neko
 */
import org.joda.time.DateTime;
import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest 
{
	   
     @Test
     public void getUsername() 
     {
	     Student testStudent = new Student("Alice", 18, new DateTime("1994-06-21"));
	     String username = "Alice18";
             try{
	       assertEquals(username, testStudent.getUsername());
             }
             catch(Exception ex){
               System.out.println("An error has appeared!: " + ex);
             }
     }
     
     
}