import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1 {

    @Test
    void shouldGetUsername(){
        Student student = new Student();
        Assertions.assertEquals("Steve20",student.getUsername("Steve",20));
    }
}
