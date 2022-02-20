/**
 * Test de la clase CalcuPosfix 
 * @author Maria Marta Ramirez 21342
 * Hoja de Trabajo 2
 * Universidad del Valle de Guatemala
**/

/**
 * importar el framework Junit
**/
import static org.junit.Assert.assertEquals;

import org.junit.Test;

class TestCalcuPosfix {
	
	@Test
	void testEvaluate() {
		CalcuPosfix calc = new CalcuPosfix();
		assertEquals(4, calc.Evaluate("6 8 + 1 * 2 /"));
	}

}
