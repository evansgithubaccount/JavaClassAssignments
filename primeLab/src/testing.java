import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class testing {
    private int inputNumber;
    private Boolean expected;
    private primeLab primeLab;

    @Before
    public void testing(int inputNumber, Boolean expected){
        this.inputNumber = inputNumber;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][]{
                {1, true},
                {2, true},
                {3, true},
                {4, false},
                {5, true}
        });
    }

    @Test
    public void testIsPrime(){
        System.out.println("Running test for " + inputNumber);
        assertEquals(primeLab.isPrime(inputNumber),expected);
    }
}
