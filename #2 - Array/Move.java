package BishopMove;
import java.util.Scanner;

public class Move {

public static void main(String[] args) {
	
	int reiniciar;
		
		String[][] board = {
				{"0","0","0","0","0","0","0","0","0"," | X"},
				{"0","R","N","B","Q","K","B","N","R"," | 1"},
				{"0","P","P","P","P","P","P","P","P"," | 2"},
				{"0"," "," "," "," "," "," "," "," "," | 3"},
				{"0"," "," "," "," "," "," "," "," "," | 4"},
				{"0"," "," "," "," "," "," "," "," "," | 5"},
				{"0"," "," "," "," "," "," "," "," "," | 6"},
				{"0","p","p","p","p","p","p","p","p"," | 7"},
				{"0","r","n","b","q","k","b","n","r"," | 8"},
				{"0","__________________________","","","","","","","",""},
				{"Y","A","B","C","D","E","F","G","H"," "}};

		 for (int i = 1; i < board.length; i++) {
		        for (int j = 1; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
		 
		 do {
		 
		 System.out.println("");
		 
		 Scanner readTurn = new Scanner(System.in);
		 
		 System.out.printf(" - Onde está a peça a ser movimentada? Informe a linha [1-8]: ");
		 int pieceEixoX = readTurn.nextInt();
		 
		 System.out.printf(" - Agora informe a coluna [A-H]: ");
		 String pieceEixoY1 = readTurn.next();
		 int pieceEixoY2 = 0;
		 
		 switch (pieceEixoY1) {
		 case "A":
		 case "a":
			 pieceEixoY2 = 1;
			 break;
		 case "B":
		 case "b":
			 pieceEixoY2 = 2;
			 break;
		 case "C":
		 case "c":
			 pieceEixoY2 = 3;
			 break;
		 case "D":
		 case "d":
			 pieceEixoY2 = 4;
			 break;
		 case "E":
		 case "e":
			 pieceEixoY2 = 5;
			 break;
		 case "F":
		 case "f":
			 pieceEixoY2 = 6;
			 break;
		 case "G":
		 case "g":
			 pieceEixoY2 = 7;
			 break;
		 case "H":
		 case "h":
			 pieceEixoY2 = 8;
			 break;
		 }
		 
		 System.out.println("");
		 
		 System.out.printf(" - Informe qual linha a peça irá [1-8]: ");
		 int moveEixoX = readTurn.nextInt();
		 
		 System.out.printf(" - Agora informe a coluna que a peça irá [A-H]: ");
		 String moveEixoY1 = readTurn.next();
		 int moveEixoY2 = 0;
		 
		 switch (moveEixoY1) {
		 case "A":
		 case "a":
			 moveEixoY2 = 1;
			 break;
		 case "B":
		 case "b":
			 moveEixoY2 = 2;
			 break;
		 case "C":
		 case "c":
			 moveEixoY2 = 3;
			 break;
		 case "D":
		 case "d":
			 moveEixoY2 = 4;
			 break;
		 case "E":
		 case "e":
			 moveEixoY2 = 5;
			 break;
		 case "F":
		 case "f":
			 moveEixoY2 = 6;
			 break;
		 case "G":
		 case "g":
			 moveEixoY2 = 7;
			 break;
		 case "H":
		 case "h":
			 moveEixoY2 = 8;
			 break;
		 }
		 
		 System.out.println("");
		 
		 board[moveEixoX][moveEixoY2] = board[pieceEixoX][pieceEixoY2];
		 board[pieceEixoX][pieceEixoY2] = " ";
		 
			 
		 for (int i = 1; i < board.length; i++) {
		        for (int j = 1; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		 }
		 
		 System.out.println("");
		 System.out.printf(" Jogar novamente? [1] SIM ou [2] NÃO -> ");
			reiniciar = readTurn.nextInt();
			System.out.println("");
			if (reiniciar == 2) {
				System.out.println("");
				System.out.println("  Jogo encerrado. Obrigado por jogar!    ");
			} else {
				System.out.println("");
				System.out.println("   Próximo movimento...         ");
				System.out.println("");
			}
			
			
			} while (reiniciar != 2);
	}
}