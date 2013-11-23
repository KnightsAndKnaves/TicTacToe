package is.ru.tictactoe;

public class Board {
	private char[] board;
	
	public Board() {
		this.board = new char[9];
		for(int i = 0; i < 9; i++)
			this.board[i] = ' ';
	}
	
	
	public char getBoard(int pos) {
		return this.board[pos];
	}
	
	public void printBoard(){
		System.out.println(this.board[0] + " " + this.board[1] + " " + this.board[2]);
		System.out.println("     ");
		System.out.println(this.board[3] + " " + this.board[4] + " " + this.board[5]);
		System.out.println("     ");
		System.out.println(this.board[6] + " " + this.board[7] + " " + this.board[8]);
	}
	
	
	
	
	public void addLetter(int pos, char letter) {
		if(pos < 9 && pos >= 0/* && canAdd(pos)*/)
			board[pos] = letter;
	}
	
	
	
	/*
	private boolean canAdd(int pos) {
			if(board[pos] == ' ') return true;
		return false;
	}
	*/
}
