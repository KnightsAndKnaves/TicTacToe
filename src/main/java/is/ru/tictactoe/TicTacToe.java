package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args){


        // Initialize game
        Player p1 = new Player(1, 'X');
		Player p2 = new Player(2, 'O');
		Board board = new Board();
		Game game = new Game(p1, p2, board);
		game.printIntro();
		

		int answer = 1;
		while{answer == 1){


			// Play again ?
			System.out.println("Want to play again ? (y/n):");
        	Scanner in = new Scanner(System.in);
			answer = Integer.parseInt(in.next());
			//System.out.println("Ég valdi: " + s); 


			
		}
		
		
         


        System.out.println("Bye bye !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");






		/*
		for(int i = 0; i < 2; i++) {
			turn(p1, board);
			turn(p2, board);
		}
		turn(p1, board);
		if(!game.end()) turn(p2, board);
		if(!game.end()) turn(p1, board);
		if(!game.end()) turn(p2, board);
		if(!game.end()) turn(p1, board);
    	*/
    }
}
