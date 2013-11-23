package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class GameTest {

	@Test
	public void resultInGame() {
		Game leikur = new Game();
		Board bord = new Board();
		bord.addLetter(0, 'X');
		bord.addLetter(3, 'X');
		bord.addLetter(6, 'X');
		
		assertEquals('X', leikur.checkWinner(bord, 'X'));
		// TODO Auto-generated method stub

	}

}
