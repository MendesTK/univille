package jogoMAT;

import java.util.Scanner;



public class trabson {
	
	public static void main(String Args[]){
		Scanner entrada = new Scanner(System.in);
		int aux = 0;
		while (aux != 3){
			System.out.println("   Jogo de Matem�tica");
			System.out.println("************************");
			System.out.println("* 1 - Novo Jogo        *");
			System.out.println("* 2 - Dificuldade      *");
			System.out.println("* 3 - Sair             *");
			System.out.println("************************");
			int pontuacao = 0; // Armazenar a pontua��o
			int dificuldade = 1;
			int tentativas = 3;
			System.out.print(": ");
			aux = entrada.nextInt();
			if (aux == 2){ // If para a escolha de dificuldade
				System.out.print("Informe a dificuldade entre 1 a 4: ");
				dificuldade = entrada.nextInt();
				System.out.print("Informe 1 para jogar: ");
				aux = entrada.nextInt();
			}
			if (aux == 1){ //Novo jogo (Se n�o for escolhido a dificuldade antes, ela come�ara em 1
				int random1, random2, resposta;
				while (tentativas > 0){
					if (dificuldade == 1){ //Soma e Subtra��o
						int soma, subtracao, random;
						for (int i = 0; i < 9; i++){
							random = (int) Math.floor(Math.random() * 10);
							if (random < 5){ //parte da soma
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								soma = random1 + random2;
								System.out.println(random1 + " + " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (soma == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
							else if (random >= 5){ //parte da subtrac�o
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								subtracao = random1 - random2;
								System.out.println(random1 + " - " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (subtracao == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontua��o total �: " + pontuacao);
							dificuldade +=1;
						}
					}
				
					else if (dificuldade == 2){ //multiplica��o
						int multiplicacao;
						for (int i = 0; i < 9; i++){
							random1 = (int) Math.floor(Math.random() * 10); 
							random2 = (int) Math.floor(Math.random() * 10);
							multiplicacao = random1 * random2;
							System.out.println(random1 + " * " + random2 + " = ?");
							System.out.print("Sua resposta: ");
							resposta = entrada.nextInt();
							if (multiplicacao == resposta){
								pontuacao += 1;
								System.out.println("Parab�ns vc acertou!");
							}
							else{
								tentativas -= 1;
								System.out.println("Resposta incorreta!");
								System.out.println("Restam " + tentativas + " vidas!");
								if (tentativas == 0){
									System.out.println("Sua pontua��o total �: " + pontuacao);
									break;
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontua��o total �: " + pontuacao);
							dificuldade +=1;
						}
					}
					else if (dificuldade == 3){ //divis�o
						int divisao;
						for (int i = 0; i < 9; i++){
							random1 = (int) Math.floor(Math.random() * 10); 
							random2 = (int) Math.floor(Math.random() * 10);
							divisao = random1 / random2;
							System.out.println(random1 + " / " + random2 + " = ?");
							System.out.print("Sua resposta: ");
							resposta = entrada.nextInt();
							if (divisao == resposta){
								pontuacao += 1;
								System.out.println("Parab�ns vc acertou!");
							}
							else{
								tentativas -= 1;
								System.out.println("Resposta incorreta!");
								System.out.println("Restam " + tentativas + " vidas!");
								if (tentativas == 0){
									System.out.println("Sua pontua��o total �: " + pontuacao);
									break;
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontua��o total �: " + pontuacao);
							dificuldade +=1;
						}
					}
					else if (dificuldade == 4){ // ultima dificuldade, misto de todos os outros
						int soma, subtracao, multiplicacao, divisao, random;
						for (int i = 0; i < 9; i++){
							random = (int) Math.floor(Math.random() * 41);
							if (random <= 10){ //soma
								random1 = (int) Math.floor(Math.random() * 100); 
								random2 = (int) Math.floor(Math.random() * 100);
								soma = random1 + random2;
								System.out.println(random1 + " + " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (soma == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
							else if (random > 10 && random <= 20){ //subtra��o
								random1 = (int) Math.floor(Math.random() * 100); 
								random2 = (int) Math.floor(Math.random() * 100);
								subtracao = random1 - random2;
								System.out.println(random1 + " - " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (subtracao == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
							else if (random > 20 && random <= 30){ //multiplica��o
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								multiplicacao = random1 * random2;
								System.out.println(random1 + " * " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (multiplicacao == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
							else if (random > 30 && random <= 40){ //divis�o
								random1 = (int) Math.floor(Math.random() * 10); 
								random2 = (int) Math.floor(Math.random() * 10);
								divisao = random1 / random2;
								System.out.println(random1 + " / " + random2 + " = ?");
								System.out.print("Sua resposta: ");
								resposta = entrada.nextInt();
								if (divisao == resposta){
									pontuacao += 1;
									System.out.println("Parab�ns vc acertou!");
								}
								else{
									tentativas -= 1;
									System.out.println("Resposta incorreta!");
									System.out.println("Restam " + tentativas + " vidas!");
									if (tentativas == 0){
										System.out.println("Sua pontua��o total �: " + pontuacao);
										break;
									}
								}
							}
						}
						if (tentativas > 0){
							System.out.println("Dificuldade concluida. Sua pontua��o total �: " + pontuacao);
							System.out.println("Parab�ns, voc� completou o game!");
						}
					}
				}
			}
			else if (aux == 3){
				System.out.print("Obrigado por jogar!");
			}
		}
		entrada.close();
	}

}