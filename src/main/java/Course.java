/******************
 ***Auhtor: Courteney Carr
 ***
 *******************/

import java.util.ArrayList;
import org.joda.time.*;
public class Course {
    private String name;
    private ArrayList<Module> modules = new ArrayList();
    private ArrayList<Student> students = new ArrayList();
    private DateTime start;
    private DateTime end;

    public Course(String name, DateTime start, DateTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void addModules(Module m) {
        modules.add(m);
    }

    public ArrayList<Module> getModules(){
        return modules;
    }

    public void addStudents(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getStudent(){
        return students;
    }
    public DateTime getStart() {
        return start;
    }

    public void setStart(DateTime start) {
        this.start = start;
    }

    public DateTime getEnd() {
        return end;
    }

    public void setEnd(DateTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", modules=" + modules +
                ", students=" + students +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
