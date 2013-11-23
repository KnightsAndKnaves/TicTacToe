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
		
		int moves=0;

		System.out.println(p1.getLetter());
		System.out.println(p2.getLetter());
		/*
		while(board.checkWin == ' ')
		{

		}
		*/

		System.out.println("Leikmaður " + board.checkWin() + " sigrar");








		/*
		while(game.checkWin==' '){


		}

		*/
		//Leyfa spilara að skiptast á að gera



		


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
