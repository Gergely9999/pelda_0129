import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class UtilTest {

    @Test
    public void shouldReturnMinusOneWhenEmptyArray() {
        int result = Utils.maxker(new int[]{});
        assertEquals(-1, result);

    }

    @Test
    public void shouldReturnMinusOneWhenNullArray() {
        int result = Utils.maxker(null);
        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnCorrectIndexOnIntegerMinValue() {
        int result = Utils.maxker(new int[]{Integer.MIN_VALUE});
        assertEquals(0, result);
    }


}
