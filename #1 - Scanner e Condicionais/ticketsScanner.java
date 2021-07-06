package exercise1Scanner;
import java.util.Scanner;


public class ticketsScanner {

	public static void main(String[] args) {
	
		Scanner readUserData = new Scanner(System.in);
		int reiniciar;
		
		do {
		
		System.out.println("|-----------------------------------------------|");
		System.out.println("|              SISTEMA DE CALCULO               |");
		System.out.println("|             DA RENDA DE INGRESSOS             |");
		System.out.println("|-----------------------------------------------|");
		System.out.println("|       Inserir a Qtd dos tickets abaixo        |");
		System.out.println("|-----------------------------------------------|");
		System.out.println("");
		
		System.out.printf(" Qtd vendida de ingressos Classe A: ");		
		int ticketA = readUserData.nextInt();
		
		System.out.println("");
				
		System.out.printf(" Qtd vendida de ingressos Classe B: ");
		int ticketB = readUserData.nextInt();
		
		System.out.println("");
		
		System.out.printf(" Qtd vendido de ingressos Classe C: ");
		int ticketC = readUserData.nextInt();
		
		int totalTicketA = 50 * ticketA;
		int totalTicketB = 30 * ticketB;
		int totalTicketC = 20 * ticketC;
		
		System.out.println("");
		System.out.println("|-----------------------------------------------|");
		System.out.println("");
		System.out.println("           Valores arrecadados:            ");
		System.out.println("");
		
		System.out.println(" Total arrecadado Classe A: R$" + totalTicketA);
		System.out.println("");
		System.out.println(" Total arrecadado Classe B: R$" + totalTicketB);
		System.out.println("");
		System.out.println(" Total arrecadado Classe C: R$" + totalTicketC);
		System.out.println("");
		System.out.println(" Total arrecadado Classes A+B+C: R$" + (totalTicketA + totalTicketB + totalTicketC));
		System.out.println("");
		System.out.println("|-----------------------------------------------|");
		System.out.println("");
		
		System.out.printf(" Calcular novamente? [1] SIM ou [2] NÃO) -> ");
		reiniciar = readUserData.nextInt();
		System.out.println("");
		System.out.println("|-----------------------------------------------|");
		if (reiniciar == 2) {
			System.out.println("");
			System.out.println("    Sistema encerrado. Obrigado por usar!    ");
		} else {
			System.out.println("");
			System.out.println("                Reiniciando...                 ");
			System.out.println("");
		}
		
		
		} while (reiniciar != 2);		

	}

}
