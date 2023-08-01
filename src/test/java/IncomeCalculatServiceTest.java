import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa67.IncomeCalculator.service.IncomeCalculatService;

public class IncomeCalculatServiceTest {
    @Test
    public void calcFor10_000(){
        IncomeCalculatService service =new IncomeCalculatService();
        int expected = 3;
        int actual = service.incomeCalc(10_000, 3_000, 20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcFor100_000(){
        IncomeCalculatService service =new IncomeCalculatService();
        int expected = 2;
        int actual = service.incomeCalc(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);
    }
}
