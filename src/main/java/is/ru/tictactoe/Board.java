package is.ru.tictactoe;

public class Board {
	private char[] board;
	
	public Board() {
		this.board = new char[9];
		for(int i = 0; i < 9; i++)
			board[i] = ' ';
	}
	/*
	public char[] getBoard() {
		return board;
	}
	*/
	public void printBoard(){
		System.out.println("");
	}

	public void addLetter(int pos, char letter) {
		if(pos < 9 && pos >= 0 && canAdd(pos))
			board[pos] = letter;
		//TODO Hvað á að gerast ef ekki er hægt að merkja þennan reit 
	}
	
	private boolean canAdd(int pos) {
			if(board[pos] == ' ') return true;
		return false;
	}
}
