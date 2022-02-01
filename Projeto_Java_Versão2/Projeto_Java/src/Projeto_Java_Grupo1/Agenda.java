package Projeto_Java_Grupo1;

//import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	
	static int avisa;
	
	


	public static void main(String[] args) {
		
		//Variaveis do cadastro     //numero de contatos para armazenar
		String [] nome = new String[20];
		String [] endereco = new String[20];
		String [] telefone = new String[20];
		String [] pergunta1 = new String[20];
		String [] pergunta2 = new String[20];
		
								
		//Exceção para listar os cadastros somente com dados
		for (int i = 0; i < 20; i++) {
			nome[i] = "";
			telefone[i] = "";
		    endereco[i] = "";
		    
		}
		
		String opcao = "";
		String continuar = "";
		int posicao = 0;
		String nomeExcluir = "";
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		do {
			
			//lista de menu que aparece para o usuário
			System.out.println("Escolha a opção: Incluir - Listar - Excluir - Sair");
			opcao = entrada.nextLine();
			
			switch (opcao) {
			case "Incluir":
				
				// codigo para incluir
				do {
					System.out.print(" Digite o nome: ");
					nome[posicao] = entrada.nextLine();
					
					System.out.print(" Digite o endereço: ");
					endereco[posicao] = entrada.nextLine();
					
					System.out.print(" Digite o telefone: ");
					telefone[posicao] = entrada.nextLine();
					
					System.out.println(" Sintomas do HIV \n");
					
					String [] sintomas = new String[9];
					
									
					sintomas[0] = "1 - Febre Alta constante ";
					sintomas[1] = "2 - Mancha branca na lingua e boca ";
					sintomas[2] = "3 - Suores noturnos frequentes ";
					sintomas[3] = "4 - Manchas vermelhas na pele ";
					sintomas[4] = "5 - Dificuldade para respirar ";
					sintomas[5] = "6 - Tosse persistente ";
					sintomas[6] = "7 - feridas na região genital ";
					sintomas[7] = "8 - Perda de peso ";
					sintomas[8] = "9 - Problemas de memória \n";
					
					for (int i = 0; i < 9; i++) {
						System.out.println(sintomas[i] + " ");
					}
						Scanner pergunta = new Scanner(System.in);
					
						System.out.println("Teve contato com agulhas ou fez transfusão de sangue? ");
						pergunta1[posicao] = pergunta.next();
						
						System.out.println("Teve relações sexuais recentemente? ");
						pergunta2[posicao] = pergunta.next();
						
											
						System.out.println("Dentre os sintomas do HIV, quantos você apresenta? (Responder em número) ");
						
						System.out.println("");
						Scanner alerta = new Scanner(System.in);
												
						avisa = alerta.nextInt();
							
					      	if(avisa >= 4 ) {
							System.out.println("Será encaminhado uma equipe até sua casa \n");
							
							
						} else {
							System.out.println("Faremos o envio de um teste até a sua residência");
						}
						
					System.out.print("Deseja continuar o cadastramento? ");
					continuar = entrada.nextLine();
					
					posicao++;
					
				} while (continuar.equals("Sim"));
				
				break;
				
			case "Listar":
				//condigo para listar
				for (int i = 0; i < 20; i++) {
					
					if(!nome[i].equals("")) {
						
						System.out.println(" Nome: " + nome[i] + " |" + 
								 " Telefone: " + telefone[i] + " |" +
									 " Endereço: " + endereco[i] + " |" +
									     " Sintomas apontados: " + avisa + " |" +
									 		 "\n 1 - Fez transfusão de sangue ou teve contato com agulhas? - " + pergunta1[i] + 
									 		 "\n 2 - Teve relações sexuais recentes? - " + pergunta2[i]);
						
					}
					
					
				}
				
				break;
				
				
			case "Excluir":
				// codigo para excluir o cadastro
				System.out.println("Quem deseja excluir? ");
				nomeExcluir = entrada.nextLine();
				
				for (int i = 0; i < 20; i++) {
					if (nome[i].equals(nomeExcluir)) {
						
						nome[i] = "";
						telefone[i] = "";
						endereco[i] = "";
						pergunta1[i] = "";
						pergunta2[i] = "";
					}
					
				}
				break; 
				
			case "Sair":
				// codigo para sair
				System.out.println("Programa Finalizado.");
				return;
				
													
				default:
					// Opção invalida!
					System.out.println("Opção inválida! Tente novamente");
					break;
			}
			
		} while (!opcao.equals("Sair"));

	}

}
