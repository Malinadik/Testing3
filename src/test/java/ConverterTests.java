import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConverterTests {
    Converter converter = new Converter();
    @Test
    public void testOldRussian(){
        Assertions.assertEquals(0.11125, converter.oldRussian(1, 2.5));
        Assertions.assertEquals(0.445, converter.oldRussian(2, 2.5));
        Assertions.assertEquals(1.125, converter.oldRussian(3, 2.5));
        Assertions.assertEquals(6.2, converter.oldRussian(4, 2.5));
        Assertions.assertEquals(4.4, converter.oldRussian(5, 2.5));
        Assertions.assertEquals(0.775, converter.oldRussian(6, 2.5));
        Assertions.assertEquals(0.0625, converter.oldRussian(7, 2.5));
        Assertions.assertEquals(5.325, converter.oldRussian(8, 2.5));
        Assertions.assertEquals(2.275, converter.oldRussian(9, 2.5));
        Assertions.assertEquals(2667.5, converter.oldRussian(10, 2.5));
        Assertions.assertEquals(1.775, converter.oldRussian(11, 2.5));
    }
}
