import logic.CalculatorLogic;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorLogicTests {

    @Test
    public void Test_isBigger(){
        Assert.assertFalse(CalculatorLogic.isBigger(1,2));
        Assert.assertTrue(CalculatorLogic.isBigger(2, 1));
    }

    @Test
    public void Test_isEqual(){
        Assert.assertTrue(CalculatorLogic.isEqual(1,1));
    }

}
