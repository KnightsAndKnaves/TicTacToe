package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class RoutinesTest{
  
  	// Einingarprófanir
	@Test
	public void greetResultInRoutines(){
		//System.out.println("greetResultInHello TEST");
		Routines world = new Routines();
		assertEquals("Hello World!", world.greet());
	}     
}

