package is.ru.tictactoe;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args){

		

		int i = 1;
		while(i==1){
	        // Initialize game
	        Player p1 = new Player(1, 'X');
			Player p2 = new Player(2, 'O');
			Board board = new Board();
			Game game = new Game(p1, p2, board);
			game.printIntro();
			board.printBoard();
			int moves=0;

			int whosTurn = 1;
			char winner = ' ';
			while(board.checkWin()==' '){
				if (whosTurn==1){
					System.out.println("Leikmadur 1 á ad gera: ");
					game.makeMove(p1, board);
					whosTurn=2;
				}
				else
				{
					System.out.println("Leikmadur 2 á ad gera: ");

					game.makeMove(p2, board);
					whosTurn=1;
				}
				board.printBoard();
				winner = board.checkWin();
			}
			
			
			if(winner=='T'){
				System.out.println("JAFNTEFLI - ENGINN VINNUR");
			}
			else{
				System.out.println("Leikmaður " + board.checkWin() + " sigrar");
			}

			System.out.println("Viljið þið spila aftur ? 1=já og 2=nei");
			Scanner sc = new Scanner(System.in);
 			i = sc.nextInt();
		}
    }
}
