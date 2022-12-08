package FinalProject;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class TicTacToeGame {

	public static final char CROSS = 'X';
	public static final char CIRCLE = 'O';

	// Need to have multiple methods for organizing the code.

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to Tic-Tac-Toe!");
		System.out.println("Would you like to go first? (Enter yes or no)");
		String awnser = console.next();
		char usersymbol = 'd';
		char computersymbol = 'z';
		if (awnser.equalsIgnoreCase("Yes")) { // X is to go first and O is to go last
			System.out.println("Then you will become X and the computer will become O");
			usersymbol = CROSS;
			computersymbol = CIRCLE;
		} else {
			System.out.println("Then you will become O and the computer will beocme X");
			usersymbol = CIRCLE;
			computersymbol = CROSS;
		}
		char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
		/*
		 * if (usersymbol == 'X') { System.out.
		 * println("Enter you first move by saying what row andb what column where you want to place the "
		 * + usersymbol); int firstmoverow = console.nextInt(); int firstmovecolumn =
		 * console.nextInt(); board[firstmoverow][firstmovecolumn] = 'X'; } else { int
		 * firstrandomrow = r.nextInt(2); int firstrandomcolumn = r.nextInt(2);
		 * board[firstrandomrow][firstrandomcolumn] = 'X';
		 * 
		 * }
		 */
		//Start the input from here
		int rows = 0; 
		int columns = 0; 
		int randomrows = 0;
		int randomcolumns = 0; 
		while (true) {
			System.out.println("Enter the rows and columns for placing your" + usersymbol); 
			rows = console.nextInt() - 1; 
			columns = console.nextInt() - 1; 
			board[rows][columns] = usersymbol; 
			printboard(board); 
			checker(board);  
			randomrows = r.nextInt(2);
			randomcolumns = r.nextInt(2);
			if (board[randomrows][randomcolumns] == board[rows][columns])
			board[randomrows][randomcolumns] = computersymbol;
			printboard(board); 
			checker(board); 

		}


		
	/*	while (checker(board)) {
			printboard(board);
			System.out.println("Enter you first move by saying what row and what column where you want to place the" + usersymbol);
			int row = console.nextInt() - 1;
			int column = console.nextInt() - 1;
			board[row][column] = usersymbol;
			int randomrow = r.nextInt(2);
			int randomcolumn = r.nextInt(2);
			if (board[randomrow][randomcolumn] == board[row][column])
			board[randomrow][randomcolumn] = computersymbol;

		} */

		// Size not the index
		// tictactoerealgame(usersymbol, computersymbol, console, r);

	}

	/*
	 * public static void tictactoerealgame(char usersymbol, char computersymbol,
	 * Scanner console, Random r) {
	 * 
	 * 
	 * 
	 * printboard(board); while (board[][]) {
	 * 
	 * }
	 * 
	 * }
	 */

	public static void printboard(char[][] board) {
		for (int rows = 0; rows < board.length - 1; rows++) {
			for (int columns = 0; columns < board[rows].length - 1; columns++) {
				System.out.print(" " + board[rows][columns] + " |");
			}
			System.out.print(" " + board[rows][board[rows].length - 1]);
			System.out.println("\n-----------");
		}
		for (int columns = 0; columns < board[board.length - 1].length - 1; columns++) {
			System.out.print(" " + board[board.length - 1][columns] + " |");
		}
		System.out.print(" " + board[board.length - 1][board[board.length - 1].length - 1]);
		System.out.println();
	}

	public static void placecharacter(char[][] board, Scanner console, char computersymbol, char usersymbol, Random r) {
		
		
	}
	public static boolean checker(char[][] board) {
		return !((board[0][0] == board[0][1] && board[0][1] == board[0][2])
				|| (board[1][0] == board[1][1] && board[1][1] == board[1][2])
				|| (board[2][0] == board[2][1] && board[2][1] == board[2][2])
				|| (board[0][0] == board[1][0] && board[1][0] == board[2][0])
				|| (board[0][1] == board[1][1] && board[1][1] == board[2][1])
				|| (board[0][2] == board[1][2] && board[1][2] == board[2][2])
				|| (board[0][0] == board[1][1] && board[1][1] == board[2][2])
				|| (board[0][2] == board[1][1] && board[1][1] == board[2][0])); 
	}

}
