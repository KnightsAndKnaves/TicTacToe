package is.ru.tictactoe;

public class Player {
	private int id;
	private char letter;
	
	public Player(int playerID, char letter) {
		this.id = playerID;
		if(playerID == 1)
			this.letter = 'X';
		else if(playerID == 2)
			this.letter = 'O';
		else
			this.letter = ' ';
	}
	
	public char getLetter() {
		return letter;
	}
}