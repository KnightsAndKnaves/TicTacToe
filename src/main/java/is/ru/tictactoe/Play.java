package is.ru.tictactoe;

public class Play {
	/*
	public static void turn(Player player, Board board) {
		System.out.print("Enter position: ");
		// get int pos from input using parseInt
		int pos=2;
		board.addLetter(pos, player.getLetter());
		// draw board, need to make function either here or in Board class
		// check for win or tie
		//if win/tie, write on the screen who won
	}
	*/
	
	public static void main(String[] args) {
		Routines test = new Routines();
		test.greet();
		Player p1 = new Player(1, 'X');
		Player p2 = new Player(2, 'O');
		Board board = new Board();
		Game game = new Game(p1, p2, board);
		for(int i = 0; i < 2; i++) {
			turn(p1, board);
			turn(p2, board);
		}
		turn(p1, board);
		if(!game.end()) turn(p2, board);
		if(!game.end()) turn(p1, board);
		if(!game.end()) turn(p2, board);
		if(!game.end()) turn(p1, board);
	}
}
