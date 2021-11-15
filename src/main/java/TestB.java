import org.joda.time.DateTime;

import java.util.ArrayList;

public class TestB {
    public static void main (String[] args){
        Course course1 = new Course("Engineering", new DateTime(2021,9,1,9,0),new DateTime(2022,5,31,16,0));
        Course course2 = new Course("Science",new DateTime(2021,9,2,9,0),new DateTime(2022,6,30,9,0));

        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        Module module1 = new Module("Computers","78920365");
        Module module2 = new Module("Biology","98767543");
        Module module3 = new Module("Maths","12345678");


        Student student1 = new Student("Evan",20,"E@g.c","12/05/2001");
        Student student2 = new Student("Perry",22,"p@g.c","05/05/1999");
        Student student3 = new Student("Ally",18,"a@g.c","17/05/2003");
        Student student4 = new Student("Sarah",21,"s@g.c","08/05/2000");

        //Courses have students and modules
        //modules are associated with courses and have students
        //students are assosiated with modules and courses.
        //For each different course they will have seperate arrays of modules
        //each module will have different students taking it/
        //
        course1.addModules(module1);
        course1.addModules(module3);

        course2.addModules(module2);
        course2.addModules(module3);

        student1.addCourses(course1);
        student2.addCourses(course1);
        student3.addCourses(course2);
        student4.addCourses(course2);

        for(Course c: courses){
            for(Student s: c.getStudent()){
                for(Module m: c.getModules()){
                    s.addModules(m);
                }
            }
        }
        //Printing all courses and their associated modules and students
        for (Course c: courses){
            System.out.print(c.toString());
            for(Student s: c.getStudent()){
                System.out.print(s.toString());
                for(Module m: c.getModules()){
                    System.out.print(m.toString());
                }
            }
        }


    }
}
