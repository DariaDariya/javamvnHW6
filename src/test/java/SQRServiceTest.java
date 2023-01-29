import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalcExact() {
        SQRService service = new SQRService();

        int expected = 6;
        int actual = service.calcSQR(400, 200);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcInexact() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calcSQR(300, 200);

        Assertions.assertEquals(expected, actual);
    }
}

