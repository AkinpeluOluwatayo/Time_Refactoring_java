import main.java.org.model.Time;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TimeTest {
    @Test
    public void testHour() {
        Time time = new Time();
        int actual = Time.setTime();
    }

}