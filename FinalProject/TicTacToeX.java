package FinalProject;

import java.util.Scanner;
import java.util.Random;

public class TicTacToeX {

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
			char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
			while (checker(board) == true) {
				printboard(board);
				placecharacteruser(board, console, usersymbol);
				checker(board);
				placecharactercomputer(board, r, computersymbol);
				checker(board);
			}
			printboard(board); 
			finalchecker(board, usersymbol, computersymbol); 

		} else {
			System.out.println("Then you will become O and the computer will beocme X");
			usersymbol = CIRCLE;
			computersymbol = CROSS;
			char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
			while (checker(board) == true) {
				placecharactercomputer(board, r, computersymbol);
				checker(board);
				printboard(board);
				placecharacteruser(board, console, usersymbol);
				checker(board);
			}
			printboard(board); 
			finalchecker(board, usersymbol, computersymbol); 
		}

	}

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

	public static void placecharacteruser(char[][] board, Scanner console, char usersymbol) {
		System.out.println("Enter the rows and columns for placing your symbol");
		int rows = console.nextInt() - 1;
		int columns = console.nextInt() - 1;
		boolean checkx = board[rows][columns] == 'X' || board[rows][columns] == 'O';
		if (checkx == true) {
			System.out.println("Please enter another position that is not taken up");
			while (!checkx) {
				rows = console.nextInt() - 1;
				columns = console.nextInt() - 1;
			}
		}
		board[rows][columns] = usersymbol;

	}

	public static void placecharactercomputer(char[][] board, Random r, char computersymbol) {
		int randomrows = r.nextInt(2);
		int randomcolumns = r.nextInt(2);
		boolean checkx = board[randomrows][randomcolumns] == 'X' || board[randomrows][randomcolumns] == 'O';
		if (checkx == true) {
			while (!checkx) {
				randomrows = r.nextInt(2);
				randomcolumns = r.nextInt(2);
			}
		}
		board[randomrows][randomcolumns] = computersymbol;
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
	public static boolean check(char[][] board) {
		
		return true; 
	}

	public static void finalchecker(char[][] board, char usersymbol, char computersymbol) {
		if (((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
				|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
				|| (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')

				|| (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
				|| (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
				|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')

				|| (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
				|| (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) && usersymbol == 'X') {

			System.out.println("Congratulations, you've won!");

		} else if (((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
				|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
				|| (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')

				|| (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
				|| (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
				|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')

				|| (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
				|| (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X')) && computersymbol == 'X') {
			System.out.println("Sorry, try next time:(");

		} else if (((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
				|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
				|| (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')

				|| (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
				|| (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
				|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')

				|| (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
				|| (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) && usersymbol == 'O') {
			System.out.println("Congratulations, you've won!");

		} else if ((((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
				|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
				|| (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')

				|| (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
				|| (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
				|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')

				|| (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
				|| (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O')) && computersymbol == 'O')) {
			System.out.println("Sorry, try next time:(");

		}
	}

}
