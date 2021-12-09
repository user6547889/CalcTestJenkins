import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Test class showing the @DisplayName annotation.")
public class CalculatorTest {



    @Test
    @DisplayName("TestAddDisplayName")
    public void TestAdd() {
        Calculator c = new Calculator();
        Integer r = c.add(1,3);
        assertEquals(4,r, () -> "Failssdfsdfsdfsdf");

    }
}
