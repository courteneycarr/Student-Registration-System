/******************
 ***Auhtor: Courteney Carr
 ***
 *******************/

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private String moduleID;
    private ArrayList<Student> students = new ArrayList();
    private ArrayList<Course> courses = new ArrayList();

    public Module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }
    //Methods to add to arrayLists

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    //Getter and setter methods
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }
}

