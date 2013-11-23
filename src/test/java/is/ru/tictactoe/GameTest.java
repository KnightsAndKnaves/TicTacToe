package is.ru.tictactoe;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class GameTest {

	@Test
	public void resultCheckWinBoard() {
		//Game leikur = new Game();
		Board bord = new Board();
		
		//Winner
		bord.addLetter(0, 'X');
		System.out.println("DEBUG2" + bord.getBoard[0]);
		bord.addLetter(3, 'X');
		bord.addLetter(6, 'X');
		
		
		bord.addLetter(1, 'O');
		bord.addLetter(2, 'O');
		bord.addLetter(4, 'O');
		bord.addLetter(5, 'X');
		bord.addLetter(7, 'X');
		bord.addLetter(8, 'O');
		bord.printBoard();

		System.out.println("DEBUG: " + bord.checkWin());

		assertEquals('X', bord.checkWin());

	}


	@Test
	public void resultCanAddBoard() {
		Board bord = new Board();
		
		//Winner
		bord.addLetter(0, 'X');


		bord.printBoard();
		

		assertEquals(false, bord.canAdd(0));

	}

}
