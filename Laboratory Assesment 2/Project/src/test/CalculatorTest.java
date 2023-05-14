package tests;

// Imports
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import project.Calculator;

/**
 *
 * @authors Diego Díaz, Pablo Alonso, Marco Fernández
 */
@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    private Calculator euclideanObject;
    private Calculator matrixObject;

    // Constructor
    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("\nInitializing main class for testing the"
                + " \"extendedEuclidean\" and \"determinant3Matrix\" method.");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("");
    }

    // To execute before each test
    @Before
    public void setUp() {
        System.out.println("\nInitializing test...");
    }

    // To execute after each test
    @After
    public void tearDown() {
        System.out.println("Test finished!");
    }

    /**
     * Test 1 of extendedEuclidean method, of class Calculator.
     */
    @Test
    public void testExtendedEuclidean1() {

        System.out.println("extendedEuclidean - testing method - test 1");

        int a = 348;
        int b = 228;
        int expResult = 12;
        
        int result = euclideanObject.extendedEuclidean(a, b);

        assertEquals(expResult, result, 0);
    }

    /**
     * Test 2 of extendedEuclidean method, of class Calculator.
     */
    @Test
    public void testExtendedEuclidean2() {

        System.out.println("extendedEuclidean - testing method - test 2");

        int a = 234;
        int b = 69;
        int expResult = 3;
        
        int result = euclideanObject.extendedEuclidean(a, b);

        assertEquals(expResult, result, 0);
    }

    /**
     * Test 3 of extendedEuclidean method, of class Calculator.
     */
    @Test
    public void testExtendedEuclideanWrongParameters() {

        System.out.println("extendedEuclidean - wrong parameters test");

        try {
            euclideanObject.extendedEuclidean(12, 42);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "Second argument must be"
                    + " equal or greater than the first argument.");
        }
    }

    /**
     * Test 4 of extendedEuclidean method, of class Calculator.
     */
    @Test 
    public void testExtendedEuclideanEqualParameters() {

        System.out.println("extendedEuclidean - equal parameters test");

        int a = 64;
        int b = 64;
        int expResult = 64;
        
        int result = euclideanObject.extendedEuclidean(a, b);

        assertEquals(expResult, result, 0);
    }
    
    /**
     * Test 5 of extendedEuclidean method, of class Calculator.
     */
    @Test
    public void testExtendedEuclideanExpectedException() {
        // Testing division by 0 exception
        System.out.println("extendedEuclidean - testing division by 0 exception");
        
        Assertions.assertThrows(ArithmeticException.class,
                () -> euclideanObject.extendedEuclidean(24, 8/0));
    }
    
    /**
     * Test 1 of determinant3Matrix method, of class Calculator.
     */
    @Test
    public void testDeterminantMatrix1() {

        System.out.println("determinantMatrix - testing method - test 1");

        double[][] matrix = {{2, 3, 1}, {4, -1, 0}, {2, 1, 2}};

        assertEquals(matrixObject.determinant3Matrix(matrix), -22, 0);
    }
    
    /**
     * Test 2 of determinant3Matrix method, of class Calculator.
     */
    @Test
    public void testDeterminantMatrix2() {

        System.out.println("determinantMatrix - testing method - test 2");

        double[][] matrix = {{2, 2, 2}, {4, 4, 4}, {-5, 11, 32}};

        assertEquals(matrixObject.determinant3Matrix(matrix), 0, 0);
    }
    
    /**
     * Test 3 of determinant3Matrix method, of class Calculator.
     */
    @Test
    public void testDeterminantMatrix3() {

        System.out.println("determinantMatrix - testing method - test 3");

        double[][] matrix = {{3, 4, 2}, {5, 0, 1}, {3, 2, 3}};

        assertEquals(matrixObject.determinant3Matrix(matrix), -34, 0);
    }
    
    /**
     * Test 4 of determinant3Matrix method, of class Calculator.
     */
    @Test
    public void testDeterminant3MatrixExpectedException() {
        // Testing method with 2x2 matrix
        System.out.println("determinantMatrix - testing invalid matrix exception");
        
        double[][] matrix = {{1, 2}, {3, 4}};
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> matrixObject.determinant3Matrix(matrix));
    }
}
