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
		System.out.println(board[0] + " " + board[1] + " " + board[2]);
		System.out.println("     ");
		System.out.println(board[3] + " " + board[4] + " " + board[5]);
		System.out.println("     ");
		System.out.println(board[6] + " " + board[7] + " " + board[8]);
	}


	public char[] getBoard(){
		return board;
	}


	// Þetta fall athugar hver er sigurvegari og skilar merkinu hans (X eða O)
	public char checkWin() {
		
		// Láréttar línur yfir
		if((this.getBoard()[0] == this.getBoard()[1]) && (this.getBoard()[1] == this.getBoard()[2]))
			return this.getBoard()[0];
		if((this.getBoard()[3] == this.getBoard()[4]) && (this.getBoard()[4] == this.getBoard()[5]))
			return this.getBoard()[3];
		if((this.getBoard()[6] == this.getBoard()[7]) && (this.getBoard()[7] == this.getBoard()[8]))
			return this.getBoard()[6];

		//Lóðréttar línur
		if((this.getBoard()[0] == this.getBoard()[3]) && (this.getBoard()[3] == this.getBoard()[6]))
			return this.getBoard()[0];
		if((this.getBoard()[1] == this.getBoard()[4]) && (this.getBoard()[4] == this.getBoard()[7]))
			return this.getBoard()[1];
		if((this.getBoard()[2] == this.getBoard()[5]) && (this.getBoard()[5] == this.getBoard()[8]))
			return this.getBoard()[2];

		// Ská línur
		if((this.getBoard()[0] == this.getBoard()[4]) && (this.getBoard()[4] == this.getBoard()[8]))
			return this.getBoard()[0];
		if((this.getBoard()[2] == this.getBoard()[4]) && (this.getBoard()[4] == this.getBoard()[6]))
			return this.getBoard()[2];


		// Skilar ef enginn sigurvegari
		return ' ';
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
