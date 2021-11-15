import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    void shouldGetUsername(){
        Student student = new Student("Steve",20,"s@g.c","10/12/1999");
        Assertions.assertEquals("Steve20",student.getUsername());
    }
}
