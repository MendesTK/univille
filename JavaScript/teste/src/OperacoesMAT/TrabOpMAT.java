package OperacoesMAT;

import java.util.Scanner;


public class TrabOpMAT {
		public static void main(String[] Args){
			Scanner entrada = new Scanner(System.in);
			float aux, n1, n2, resp = 0;
			System.out.println("Para soma informe 1!");
			System.out.println("Para subtra��o informe 2!");
			System.out.println("Para multiplica��o informe 3!");
			System.out.println("Para divis�o informe 4!");
			System.out.println("Para pot�ncia informe 5");
			System.out.print(": ");
			aux = entrada.nextFloat();
			if (aux == 1){
				System.out.println("A seguir, informe os n�meros que deseja somar!");
				System.out.print(": ");
				n1 = entrada.nextFloat();
				System.out.print(": ");
				n2 = entrada.nextFloat();
				resp = n1 + n2;
				System.out.print("Resposta: "+ resp);
			
			}
			else if (aux == 2){
				System.out.println("A seguir, informe os n�meros que deseja subtrair!");
				System.out.print(": ");
				n1 = entrada.nextFloat();
				System.out.print(": ");
				n2 = entrada.nextFloat();
				resp = n1 + (-n2);
				System.out.print("Resposta: "+ resp);
			}
			else if (aux == 3){ // Inacabado
				System.out.println("A seguir, informe os n�meros que deseja multiplicar!");
				System.out.print(": ");
				n1 = entrada.nextFloat();
				System.out.print(": ");
				n2 = entrada.nextFloat();
				float aux1, aux2;
				// while > 1
				
				for (float i = 0; i < n1;){
					i += 1;
					resp += n2;
				}
				System.out.print("Resposta: "+ resp);
			}
			else if (aux == 4){
				System.out.println("A seguir, informe os n�meros que deseja Dividir!");
				System.out.print(": ");
				n1 = entrada.nextFloat();
				System.out.print(": ");
				n2 = entrada.nextFloat();
				float aux1 = n1;
				while (aux1 > 0){
					if (aux1 >= n2){
						resp += 1;
						aux1 -= n2;
					}
					else if (aux1 < n2 && aux1 > 0){
						float aux3 = 1, aux4 = n2, aux5 = 0;
						if (aux3 == 1){
							aux3 -= 1;
							while (aux4 > 0){
								aux4 -= 0.1;
								aux5 += 0.01;
							}
						}
						resp += 0.1;
						aux1 -= aux5;
						
					}
				}
				System.out.print("Resposta: "+ resp);
				
				
				//for (float i = 0; i < n2;){
					//i += 1;
					
				//}
			}
	
		}
}