package BishopMove;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;	

public class MoveJOption {

public static void main(String[] args) throws HeadlessException  {
	
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
		 
		 String inputEixoX1 = JOptionPane.showInputDialog("Onde está a peça a ser movimentada?\nInforme a linha [1-8]:");
		 int pieceEixoX = Integer.parseInt(inputEixoX1);
		 
		 String inputEixoY = JOptionPane.showInputDialog("Agora informe a coluna [A-H]:");		  
		 int pieceEixoY = 0;
		 
		 switch (inputEixoY) {
		 case "A":
		 case "a":
			 pieceEixoY = 1;
			 break;
		 case "B":
		 case "b":
			 pieceEixoY = 2;
			 break;
		 case "C":
		 case "c":
			 pieceEixoY = 3;
			 break;
		 case "D":
		 case "d":
			 pieceEixoY = 4;
			 break;
		 case "E":
		 case "e":
			 pieceEixoY = 5;
			 break;
		 case "F":
		 case "f":
			 pieceEixoY = 6;
			 break;
		 case "G":
		 case "g":
			 pieceEixoY = 7;
			 break;
		 case "H":
		 case "h":
			 pieceEixoY = 8;
			 break;
		 }
		 
		 String inputEixoX2 = JOptionPane.showInputDialog("Informe qual linha a peça irá [1-8]:");
		 int moveEixoX = Integer.parseInt(inputEixoX2);
		 
		 String inputEixoY2 = JOptionPane.showInputDialog("Agora informe a coluna que a peça irá [A-H]:");
		 int moveEixoY = 0;
		 
		 switch (inputEixoY2) {
		 case "A":
		 case "a":
			 moveEixoY = 1;
			 break;
		 case "B":
		 case "b":
			 moveEixoY = 2;
			 break;
		 case "C":
		 case "c":
			 moveEixoY = 3;
			 break;
		 case "D":
		 case "d":
			 moveEixoY = 4;
			 break;
		 case "E":
		 case "e":
			 moveEixoY = 5;
			 break;
		 case "F":
		 case "f":
			 moveEixoY = 6;
			 break;
		 case "G":
		 case "g":
			 moveEixoY = 7;
			 break;
		 case "H":
		 case "h":
			 moveEixoY = 8;
			 break;
		 }
		 
		 System.out.println("");
		 System.out.println("");
		 
		 board[moveEixoX][moveEixoY] = board[pieceEixoX][pieceEixoY];
		 board[pieceEixoX][pieceEixoY] = " ";		 
			 
		 for (int i = 1; i < board.length; i++) {
		        for (int j = 1; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		 }
		 
		 System.out.println("");
		 
		 String inputReiniciar = JOptionPane.showInputDialog("Jogar novamente? [1] SIM ou [2] NÃO ->");
		 reiniciar = Integer.parseInt(inputReiniciar);		 
			
			if (reiniciar == 2) {
				JOptionPane.showMessageDialog(null, "Jogo encerrado.\nObrigado por jogar!");
			} else {				
				JOptionPane.showMessageDialog(null, "Próximo movimento...");
			}			
			
			} while (reiniciar != 2);
	}
}