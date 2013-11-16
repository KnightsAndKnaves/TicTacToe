package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TicTacToeTest{
  
	@Test
	public void greetResultInHello(){
		System.out.println("greetResultInHello TEST");
		HelloWorld world = new HelloWorld();
		assertEquals("Hello Wo", world.greet());
		
	}     
}

