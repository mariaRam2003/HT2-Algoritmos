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

class TestStackClase {
	
	@Test
	void testPush() {
		StackClase<String> stack = new StackClase<>();
		stack.push("Prueba");
		assertEquals("Prueba", stack.peek());
	}

	
	@Test
	void testPull() {
		StackClase<String> stack = new StackClase<>();
		stack.push("Prueba");
		assertEquals("Prueba", stack.pull());
	}

	
	@Test
	void testPeek() {
		StackClase<String> stack = new StackClase<>();
		stack.push("Prueba");
		assertEquals("Prueba", stack.peek());
	}

	
	@Test
	void testCount() {
		StackClase<String> stack = new StackClase<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		assertEquals(4, stack.count());
	}

	
	@Test
	void testIsEmpty() {
		StackClase<String> stack = new StackClase<>();
		stack.push("1");
		assertEquals(false, stack.isEmpty());
		stack.pull();
		assertEquals(true, stack.isEmpty());
	}

}
