import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class AreacheckTest {

    @Test
     void tocheckareaofrectanglewithlengthfortyfiveandbreadththirtysix()
    {
        Rectangle rectangle = new Rectangle(45,36);
        int currentvalue = rectangle.area();
        int expectedvalue = 1620;
        Assertions.assertEquals(expectedvalue,currentvalue);
    }



}
