package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class GameTest {

	@Test
	public void resultInGame() {
		Game leikur = new Game();
		Board bord = new Board();
		
		//Winner
		bord.addLetter(0, 'X');
		bord.addLetter(3, 'X');
		bord.addLetter(6, 'X');
		
		
		bord.addLetter(1, 'O');
		bord.addLetter(2, 'O');
		bord.addLetter(4, 'O');
		bord.addLetter(5, 'X');
		bord.addLetter(7, 'X');
		bord.addLetter(8, 'O');
		bord.printBoard();
		
		assertEquals('X', leikur.checkWinner(bord, 'X'));
		// TODO Auto-generated method stub

	}

}