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


		//1 leikur og leikmenn skiptast á



		int whosTurn = 1;
		char winner = ' ';
		while(game.checkWin==' '){
			if whosTurn==1{
				System.out.printlm("Leikmadur 1 á ad gera: ");
				makeMove(p1, board);
				whosTurn=2
			}
			else{
				System.out.printlm("Leikmadur 2 á ad gera: ");

				makeMove(p2, board);
				whosTurn=1
			}
		}
		board.printBoard();
		winner = game.checkWin();

		System.out.println("Leikmaður " + board.checkWin() + " sigrar");


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
