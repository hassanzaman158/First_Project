/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sp16-bse-046
 */
public class TestCalculator {
    @Test
    public void testAdd(){
            //Calculator tester = new Calculator(); // MyClass is tested
        assertEquals( Calculator.add(10, 1),11);
    }
      @Test
    public void testsub(){
            Calculator tester = new Calculator(); // MyClass is tested
        assertEquals( Calculator.Subtract(10, 1),9);
    }
      @Test
    public void testDiv(){
            Calculator tester = new Calculator(); // MyClass is tested
        assertEquals( Calculator.div(10, 1),10);
    }
      @Test
    public void testmul(){
            Calculator tester = new Calculator(); // MyClass is tested
        assertEquals( Calculator.mul(10, 1),10);
    }
    
    public TestCalculator() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

  

  
}
