package Task1_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathCheckerTest {
    @Test
    public void checkExpression() throws Exception {

        assertTrue(MathChecker.checkExpression("()"));
        assertTrue(MathChecker.checkExpression("(())"));
        assertTrue(MathChecker.checkExpression("()()"));

        assertFalse(MathChecker.checkExpression("()))"));
        assertFalse(MathChecker.checkExpression(")("));
        assertFalse(MathChecker.checkExpression("())(()"));
        assertFalse(MathChecker.checkExpression("()("));
        assertFalse(MathChecker.checkExpression("()())()("));

        assertTrue(MathChecker.checkExpression("()[]"));
        assertTrue(MathChecker.checkExpression("[]{}"));
        assertTrue(MathChecker.checkExpression("([])"));

        assertTrue(MathChecker.checkExpression("[(()())]"));
        assertFalse(MathChecker.checkExpression("()(]"));

        assertFalse(MathChecker.checkExpression("([)]"));
        assertFalse(MathChecker.checkExpression("([})"));

        assertTrue(MathChecker.checkExpression("(([{()}]))"));
        assertFalse(MathChecker.checkExpression("{([]})"));
    }
}