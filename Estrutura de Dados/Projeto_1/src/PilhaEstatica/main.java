package PilhaEstatica;

import java.util.Scanner;

public class main {
	
	public static void main (String[] args) throws Exception{
		Scanner entrada = new Scanner(System.in);
		PilhaEstatica pilha = new PilhaEstatica(5);
		String placa; 
		boolean roda = true;
		int escolha;
		String pause;
		
		/*
		pilha.push(5);
		pilha.push(2);
		pilha.push(3);
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		*/
		while(roda == true){
			System.out.println("Escolha a op��o desejada:");
			System.out.println("1 - Cadastrar ve�culo.");
			System.out.println("2 - Listar ve�culos.");
			System.out.println("3 - Remover ve�culo.");
			System.out.print("Op��o desejada: ");
			escolha = entrada.nextInt();
			
			if(escolha == 1){
				System.out.print("Informe a placa: ");
				placa = entrada.next();
				pilha.push(placa);
				System.out.println("Tecla Enter para continuar.");
				pause = entrada.next();
			}
			else if(escolha == 2){
				pilha.percorrer();
			}
			
			//roda = false;
		}
		//System.out.println("Escolha a op��o desejada:");
	}

}
