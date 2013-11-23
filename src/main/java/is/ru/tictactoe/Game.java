package is.ru.tictactoe;
import java.util.Scanner;

public class Game {
	private Player player1;
	private Player player2;
	private Board board;
	
	public Game(Player p1, Player p2, Board board) {
		this.player1 = p1;
		this.player2 = p2;
		this.board = new Board();
	}

	public Game() {
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
		System.out.println("################################");
		System.out.println("### Want to play TicTacToe ? ###");
		System.out.println("################################");
	}


	public void makeMove(Player player, Board board){

		do{
			System.out.println("Leikmadur " + player.getId() +  " á ad gera: ");
			Scanner sc = new Scanner(System.in);
 			int i = sc.nextInt();
 		}while(!board.canAdd(i))


		board.addLetter(i, player.getLetter());
	}


	/*
	public boolean playAgain(){

		// Á eftir að útfæra
		return false;
	}
	*/


	
	
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
