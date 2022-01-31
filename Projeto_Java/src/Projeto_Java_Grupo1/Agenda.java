package Projeto_Java_Grupo1;

//import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {
		
		//Variaveis do cadastro     //numero de contatos para armazenar
		String [] nome = new String[20];
		String [] endereco = new String[20];
		String [] telefone = new String[20];
		
				
		//String [] sintomas = new String[9];
		
		//ArrayList<String> lista = new ArrayList();
		//lista.add("Exemplo3");
		//lista.add("Exemplo2");
		//lista.add("Exemplo");
		
		//sintomas[0] = "Febre Alta constante";
		//sintomas[1] = "Mancha branca na lingua e boca";
		//sintomas[2] = "Suores noturnos frequentes";
		//sintomas[3] = "Manchas vermelhas na pele";
		//sintomas[4] = "Dificuldade para respirar";
		//sintomas[5] = "Tosse persistente";
		//sintomas[6] = "feridas na região genital";
		//sintomas[7] = "Perda de peso";
		//sintomas[8] = "Problemas de memória";
		
		
		
		//Exceção para listar os cadastros somente com dados
		for (int i = 0; i < 20; i++) {
			nome[i] = "";
			telefone[i] = "";
		    endereco[i] = "";
		    //sintomas[i] = "";
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
					System.out.print("Digite o nome: ");
					nome[posicao] = entrada.nextLine();
					
					System.out.print("Digite o endereço: ");
					endereco[posicao] = entrada.nextLine();
					
					System.out.print("Digite o telefone: ");
					telefone[posicao] = entrada.nextLine();
					
										
					
					System.out.print("Deseja continuar o cadastramento? ");
					continuar = entrada.nextLine();
					
					posicao++;
					
				} while (continuar.equals("Sim"));
				
				break;
				
			case "Listar":
				//condigo para listar
				for (int i = 0; i < 20; i++) {
					
					if(!nome[i].equals("")) {
						
						System.out.println(" Nome: " + nome[i] + " " + 
								 " Telefone: " + telefone[i] + 
									 " Endereço: " + endereco[i]);
						
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
