package is.ru.tictactoe;

public class Game {
	private Player player1;
	private Player player2;
	private Board board;
	
	public Game(Player p1, Player p2, Board board) {
		this.player1 = p1;
		this.player2 = p2;
		this.board = new Board();
	}
	/*
	public Player whosTurn(int playerID) {
		if(playerID == 1) return player1;
		else if(playerID == 2) return player2;
		else return null;
	}
	*/
	public void printIntro(){
		System.out.println("##############################");
		System.out.println("### Want to play TicTacToe ###");
		System.out.println("##############################");
	}

	public boolean playAgain(){
		
	}


	
	public char checkWin(char letter) {
		/*
		if(board.getBoard()[0] == letter && board.getBoard()[1] == letter && board.getBoard()[2] == letter)
			return true;
		if(board.getBoard()[3] == letter && board.getBoard()[4] == letter && board.getBoard()[5] == letter)
			return true;
		if(board.getBoard()[6] == letter && board.getBoard()[7] == letter && board.getBoard()[8] == letter)
			return true;
		if(board.getBoard()[0] == letter && board.getBoard()[3] == letter && board.getBoard()[6] == letter)
			return true;
		if(board.getBoard()[1] == letter && board.getBoard()[4] == letter && board.getBoard()[7] == letter)
			return true;
		if(board.getBoard()[2] == letter && board.getBoard()[5] == letter && board.getBoard()[8] == letter)
			return true;
		if(board.getBoard()[0] == letter && board.getBoard()[4] == letter && board.getBoard()[8] == letter)
			return true;
		if(board.getBoard()[2] == letter && board.getBoard()[4] == letter && board.getBoard()[6] == letter)
			return true;
		return false;
		*/
		return 'X';
	}
	/*
	public boolean tie() {
		for(int i = 0; i < 9; i++)
			if(board.getBoard()[i] == ' ') return false;
		if(win('X') == true || win('O') == true) return false;
		return true;
	}
	
	public boolean end() {
		if(win('X') || win('O')) return true;
		if(tie()) return true;
		return false;
	}
	*/
}
