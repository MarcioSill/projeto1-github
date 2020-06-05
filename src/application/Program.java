package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int val = sc.nextInt();		
	
		String[] nome = new String[val];
		
		sc.nextLine(); // lembre-se de colocar para desalocar
		
		for(int i = 0; i < val; i++)
		{
			
			System.out.print("Digite o nome:");
			
			nome[i] = sc.nextLine();			
			
		}
		
		System.out.println();
		for(int i = 0; i < val; i++) {
		System.out.println("Nome: " + nome[i]);
		}
		
		
		sc.close();

	}

}
