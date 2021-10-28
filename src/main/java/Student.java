/******************
 ***Auhtor: Courteney Carr
 ***
 *******************/
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String email;
    private String dateOB;
    private int idNumber;
    private ArrayList<Course> courses = new ArrayList();
    private ArrayList<Module> modules = new ArrayList();

    // construct a new student with given fields
    public Student() {
        this.name="";
        this.age=0;
        this.email="";
        this.dateOB="";

    }

    //Methods to add to arrayLists

    public void addCourses(Course c) {
        courses.add(c);
    }

    public void addModules(Module m) {
        modules.add(m);
    }

    //Getter and Setter methods
    public String getUsername(String name, int age) {
        return name + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOB() {
        return dateOB;
    }

    public void setDateOB(String dateOB) {
        this.dateOB = dateOB;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}