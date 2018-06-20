/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import moe.lisp.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author koide
 *//**
 *
 * @author koide
 */
public class CalculatorTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    /**
     * 2引数とも正整数の場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数10, 20<br/>
     * 期待する結果: 戻り値 200<br/>
     */    
    @Test
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 200;
        int actual = calc.multiply(10, 20);
        assertEquals(expected, actual);
    }

    /**
     * 引数の一方が正数、他方が負数の場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数-10, 20<br/>
     * 期待する結果: 戻り値 -200<br/>
     */        
    @Test
    public void testMultiply02() throws Exception {
        Calculator calc = new Calculator();
        int expected = -200;
        int actual = calc.multiply(-10, 20);
        assertEquals(expected, actual);
    }

    /**
     * 引数にゼロが含まれる場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数0, -20<br/>
     * 期待する結果: 戻り値 0<br/>
     */    
    @Test
    public void testMultiply03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 0;
        int actual = calc.multiply(0, -20);
        assertEquals(expected, actual);
    }
    
    /**
     * ３引数が小さい順が場合のテスト<br/>
     * 対象: multiply(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     */    
    @Test
    public void testMax01() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(10, 20, 30);
        assertEquals(expected, actual);
    }

    /**
     * ３引数が大きい順が場合のテスト<br/>
     * 対象: multiply(int, int, int)<br/>
     * 条件: 引数30, 20, 10<br/>
     * 期待する結果: 戻り値 30<br/>
     */    
    @Test
    public void testMax02() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(30, 20, 10);
        assertEquals(expected, actual);
    }

    /**
     * ３引数の順番がバラバラの場合のテスト<br/>
     * 対象: multiply(int, int, int)<br/>
     * 条件: 引数20, 30, 10<br/>
     * 期待する結果: 戻り値 30<br/>
     */    
    @Test
    public void testMax03() throws Exception {
        Calculator calc = new Calculator();
        int expected = 30;
        int actual = calc.max(20, 30, 10);
        assertEquals(expected, actual);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int x = 0;
        int y = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Calculator.
     */
    @Test
    public void testMax() {
        System.out.println("max");
        int a = 0;
        int b = 0;
        int c = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.max(a, b, c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
