package FinalProject;

import java.util.Random;
import java.util.Scanner;

public class Hello2 {

	public static final char CROSS = 'X';
	public static final char CIRCLE = 'O';

	// Need to have multiple methods for organizing the code.

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Welcome to Tic-Tac-Toe!");
		realgame(console, r);

	}

	public static void realgame(Scanner console, Random r) {
		System.out.println("Would you like to go first? (Enter yes or no)");
		String answer = console.next();
		boolean first = !(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"));
		if (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
			while (first == true) {
				System.out.println("Please enter a correct response");
				answer = console.next();
			}

		}
		char usersymbol = ' ';
		char computersymbol = ' ';
		char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		if (answer.equalsIgnoreCase("Yes")) {
			System.out.println("Then you will become X and the computer will become O");
			usersymbol = CROSS;
			computersymbol = CIRCLE;
			while (checker(board) == true) {
				printboard(board);
				placecharacteruser(board, console, usersymbol);
				checker(board);
				if (checker(board) == false) {
					finalchecker(board, usersymbol, computersymbol); 
					end(board, console, r, usersymbol,computersymbol); 
				}
				placecharactercomputer(board, r, computersymbol);
				checker(board);
			}
		} else {
			System.out.println("Then you will become O and the computer will beocme X");
			usersymbol = CIRCLE;
			computersymbol = CROSS;
			while (checker(board) == true) {
				placecharactercomputer(board, r, computersymbol);
				checker(board);
				printboard(board);
				placecharacteruser(board, console, usersymbol);
				checker(board);
			}
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
		if (!(board[rows][columns] == ' ')) {
			while (!(board[rows][columns] == ' ')) {
				System.out.println("Please enter another position that is not taken up");
				rows = console.nextInt() - 1;
				columns = console.nextInt() - 1;
			}
		}
		board[rows][columns] = usersymbol;

	}

	public static void placecharactercomputer(char[][] board, Random r, char computersymbol) {
		int randomrows = r.nextInt(2);
		int randomcolumns = r.nextInt(2);
		if (!(board[randomrows][randomcolumns] == ' ')) {
			while (!(board[randomrows][randomcolumns] == ' ')) {
				randomrows = r.nextInt(3);
				randomcolumns = r.nextInt(3);
			}
		}
		board[randomrows][randomcolumns] = computersymbol;
	}
	public static boolean x(char[][] board) {
		return (((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
				|| (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
				|| (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
				|| (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
				|| (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
				|| (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X')
				|| (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
				|| (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))); 
	}
	public static boolean o(char[][] board) {
		return (((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
				|| (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
				|| (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
				|| (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
				|| (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
				|| (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O')
				|| (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
				|| (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))); 
	}

	public static boolean checker(char[][] board) {
		return !(x(board) || o(board));
	}

	public static void finalchecker(char[][] board, char usersymbol, char computersymbol) { 
		if (x(board) == false && (usersymbol == 'O')) {
			System.out.println("Congratulations, you've won!");
		} else if (x(board) == false && (computersymbol == 'O')) {
			System.out.println("Sorry, try next time:(");
		} else if (o(board) == false && usersymbol == 'X') {
			System.out.println("Congratulations, you've won!");
		} else if (o(board) == false && computersymbol == 'X') {
			System.out.println("Sorry, try next time:(");
		} else {
			System.out.println("Game is a tie");
		}
	}

	public static void end(char[][] board, Scanner console, Random r, char usersymbol, char computersymbol) {
		printboard(board);
		finalchecker(board, usersymbol, computersymbol);
		System.out.println("Do you want to play again?");
		String answer2 = console.next();
		if (answer2.equalsIgnoreCase("yes")) {
			realgame(console, r);
		}
	}
}
