import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ConverterTests {
    Converter converter = new Converter();
    @Test
    public void testOldRussian(){
        Assertions.assertEquals(BigDecimal.valueOf(0.11125), converter.oldRussian(1, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(0.445), converter.oldRussian(2, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(1.125), converter.oldRussian(3, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(6.2), converter.oldRussian(4, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(4.4), converter.oldRussian(5, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(0.775), converter.oldRussian(6, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(0.0625), converter.oldRussian(7, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(5.325), converter.oldRussian(8, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(2.275), converter.oldRussian(9, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(2667.5), converter.oldRussian(10, BigDecimal.valueOf(2.5)).stripTrailingZeros());
        Assertions.assertEquals(BigDecimal.valueOf(1.775), converter.oldRussian(11, BigDecimal.valueOf(2.5)).stripTrailingZeros());
    }
}
