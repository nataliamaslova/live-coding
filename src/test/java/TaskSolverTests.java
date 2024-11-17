import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskSolverTests {

    TasksSolver ts = new TasksSolver();

    @Test
    public void testMethod1() {
        assertEquals("Четное", ts.method1(2));
        assertEquals("Нечетное", ts.method1(3));
    }

    @Test
    public void testDivideBy5And7() {
        assertTrue(ts.divideBy5And7(35));
        assertFalse(ts.divideBy5And7(45));
    }

    @Test
    public void testIsInInterval() {
        assertTrue(ts.isInInterval(25));
        assertFalse(ts.isInInterval(19));
    }

    @Test
    public void testIsSquare() {
        assertTrue(ts.isSquare(9, 3));
        assertTrue(ts.isSquare(3, 9));
        assertFalse(ts.isSquare(1, 9));
    }

    @Test
    public void testIsEnded5() {
        assertTrue(ts.isEnded5(15));
        assertTrue(ts.isEnded5(5));
        assertFalse(ts.isEnded5(20));
    }

    @Test
    public void testIsSumOfDigitEven() {
        assertTrue(ts.isSumOfDigitEven(123));
        assertFalse(ts.isSumOfDigitEven(234));
    }

    @Test
    public void testIsNumbersByAbsAreEquals() {
        assertTrue(ts.isNumbersByAbsAreEquals(-5, 5));
        assertTrue(ts.isNumbersByAbsAreEquals(3, 3));
        assertFalse(ts.isNumbersByAbsAreEquals(-5, 3));
    }

    @Test
    public void testSignOfNumber() {
        assertEquals("Positive", ts.signOfNumber(5));
        assertEquals("Negative", ts.signOfNumber(-5));
        assertEquals("Zero", ts.signOfNumber(0));
    }

    @Test
    public void testIsDivideBy2Or3() {
        assertTrue(ts.isDivideBy2Or3(6));
        assertTrue(ts.isDivideBy2Or3(9));
        assertTrue(ts.isDivideBy2Or3(4));
        assertFalse(ts.isDivideBy2Or3(5));
    }

    @Test
    public void testEvenSum() {
        assertEquals("Odd", ts.evenSum(5, 8));
        assertEquals("Even", ts.evenSum(6, 8));
    }

    @Test
    public void testIsDivideBy4And6() {
        assertTrue(ts.isDivideBy4And6(24));
        assertFalse(ts.isDivideBy4And6(18));
        assertFalse(ts.isDivideBy4And6(8));
        assertFalse(ts.isDivideBy4And6(10));
    }


    @Test
    public void testEvenAndDivisibleBy10() {
        assertEquals("Even and divisible by 10", ts.evenAndDivisibleBy10(100));
        assertEquals("Even but not Divisible by 10", ts.evenAndDivisibleBy10(52));
        assertEquals("Odd", ts.evenAndDivisibleBy10(53));
    }

    @Test
    public void testMax() {
        assertEquals(7, ts.max(7, 3, 5));
        assertEquals(5, ts.max(3, 5, 5));
        assertEquals(7, ts.max(3, 5, 7));
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(ts.isPalindrome(12321));
        assertTrue(ts.isPalindrome(1234321));
        assertTrue(ts.isPalindrome(12344321));
        assertTrue(ts.isPalindrome(123444321));
        assertFalse(ts.isPalindrome(123444521));
    }

    @Test
    public void multiple3() {
        assertEquals(90, ts.multiple3(9, 81));
        assertEquals(162, ts.multiple3(7, 81));
        assertEquals(4, ts.multiple3(18, 2));
        assertNull(ts.multiple3(5, 7));
    }

    @Test
    public void testCategorise() {
        assertEquals(Age.Child, ts.categorise(6));
        assertEquals(Age.Teenager, ts.categorise(16));
        assertEquals(Age.Adult, ts.categorise(46));
        assertEquals(Age.Senior, ts.categorise(76));
    }

    @Test
    public void testIsMultiplePlus2() {
        assertTrue(ts.isMultiplePlus2(5, 3));
        assertFalse(ts.isMultiplePlus2(3, 5));
        assertFalse(ts.isMultiplePlus2(8, 4));
    }
}
