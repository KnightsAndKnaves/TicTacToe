package is.ru.tictactoe;

import java.util.Scanner;

public class Play {
	
	public static void turn(Player player, Board board) {
		System.out.print("Enter position: ");
		
		// get int pos from input using parseInt
		int pos=2;
		board.addLetter(pos, player.getLetter());
		// draw board, need to make function either here or in Board class
		// check for win or tie
		//if win/tie, write on the screen who won
	}
	

	public static void main(String[] args) {
		
		//Initiate game and print introduction
		Player p1 = new Player(1, 'X');
		Player p2 = new Player(2, 'O');
		Board board = new Board();
		Game game = new Game(p1, p2, board);
		game.intro();

		
		//Ask if user wants to play
		System.out.println("Eigum við að spila ? (J/N):");
		Scanner a = new Scanner(System.in);
		String svar;
		svar=a.nextLine();
		System.out.println("Þú valdir:" + svar);
		if(svar=="n" || svar=="N")
			System.exit(0);
		



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
