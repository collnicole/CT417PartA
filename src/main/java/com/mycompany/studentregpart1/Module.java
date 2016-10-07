import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neko
 */
public class Module {
 
 private  String modName;
 private  int modId;
 private ArrayList<Student> listOfStudents = new ArrayList<Student>();


  public Module(String modName, int modId) {
      this.modName = modName;
      this.modId = modId;
   }

    /**
     * @return the modName
     */
    public String getModName() {
        return modName;
    }

    /**
     * @param modName the modName to set
     */
    public void setModName(String modName) {
        this.modName = modName;
    }

    /**
     * @return the modId
     */
    public int getModId() {
        return modId;
    }

    /**
     * @param modId the modId to set
     */
    public void setModId(int modId) {
        this.modId = modId;
    }
    
    public void registerNewStudent(Student s)
   {
        listOfStudents.add(s);
    }
    
    public ArrayList<Student> getStudents() 
    {
        return listOfStudents;
    }
}