import org.junit.Test;
import static org.junit.Assert.*;

public class calcTest {

    @Test
    public void testAdd(){
        Calculator calc = new Calculator();
        double result = calc.add(11,5);

        assertEquals(16,result,0.0001);
    }

    @Test
    public void testSubtract(){
        Calculator calc = new Calculator();
        double result = calc.subtract(43,16);
        assertEquals(27,result,0.0001);
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator();
        double result = calc.multiply(4,9);
        assertEquals(36,result,0.0001);
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator();
        double result = calc.divide(33,3);
        assertEquals(11,result,0.0001);
    }
}
