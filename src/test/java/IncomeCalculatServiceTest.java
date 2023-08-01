import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa67.IncomeCalculator.service.IncomeCalculatService;

public class IncomeCalculatServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "3,10000,3000,20000",
//            "2,100000,60000,150000"
//    })
    @CsvFileSource(files = "src/test/resources/IncomeCalculat.csv")
    public void calcFor10_000(int expected, int income, int expenses, int threshold){
        IncomeCalculatService service =new IncomeCalculatService();
//        int expected = 3;
        int actual = service.incomeCalc(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void calcFor100_000(){
//        IncomeCalculatService service =new IncomeCalculatService();
//        int expected = 2;
//        int actual = service.incomeCalc(100_000, 60_000, 150_000);
//        Assertions.assertEquals(expected, actual);
//    }
}
