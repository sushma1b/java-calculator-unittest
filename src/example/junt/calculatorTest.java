package example.junt;
//Arrange-Act-Assert pattern
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class calculatorTest {

    calculator objCalcUnderTest;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
        //Arrange
        objCalcUnderTest = new calculator();
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

	/* @Test
	public void testCalculator() {
		fail("Not yet implemented"); // TODO
	}
	*/

    @Test
    public void testAdd() {
        int a = 15; int b = 20;
        int expectedResult = 35;

        //Act
        int result = objCalcUnderTest.add(a,b);

        //Assertions
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testSubtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;

        int result = objCalcUnderTest.subtract(a, b);
        Assertions.assertEquals(expectedResult, result);

    }

    @Test

    public void testMultiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;

        long result = objCalcUnderTest.multiply(a, b);
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testDivide() {

        int a = 56; int b = 10;
        double expectedResult = 5.6;
        double result = objCalcUnderTest.divide(a, b);
        Assertions.assertEquals(expectedResult, result, 0.00005);

    }

	/* @Test
	public void testDividByZero()
	{
		int a = 15; int b = 0;
		objCalcUnderTest.divide(a,b);
	} */

}
