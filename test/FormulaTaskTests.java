
import org.junit.jupiter.api.Test;
import space.miroshnikov.tasks.first.Formula;
import space.miroshnikov.tasks.first.FormulaException;

import static org.junit.jupiter.api.Assertions.*;


public class FormulaTaskTests {
    // public void method_scenario_result()

    @Test
    public void setX_setXAs1_xIs1() {
        //arrange
        Formula testedFormula = new Formula();
        //act
        testedFormula.setX(1);
        //assert
        assertEquals(1, testedFormula.x);
    }

    @Test
    public void setY_setYAsNegative1_exceptionIsThrown() {
        //arrange
        Formula testedFormula = new Formula();
        //act
        FormulaException e = assertThrows(FormulaException.class, () ->
                testedFormula.setY(-1));
        //assert
        assertEquals("Значение y не может быть меньше нуля. (Корень отрицательного числа).", e.getMessage());
    }

    @Test
    public void setZ_setZAs0_exceptionIsThrown() {
        //arrange
        Formula testedFormula = new Formula();
        //act
        FormulaException e = assertThrows(FormulaException.class, () ->
                testedFormula.setZ(0));
        //assert
        assertEquals("Значение z не может быть равно нулю. (Деление на ноль).", e.getMessage());
    }

    @Test
    public void calculateResult_7PlusSqrt4DivideBy3_equals3() {
        //arrange
        Formula testedFormula = new Formula();
        testedFormula.x = 7;
        testedFormula.y = 4;
        testedFormula.z = 3;
        //act
        testedFormula.calculateResult();
        //assert
        assertEquals(3,testedFormula.result);
    }

}
