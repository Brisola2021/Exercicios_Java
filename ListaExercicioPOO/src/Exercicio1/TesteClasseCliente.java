package Exercicio1;

public class TesteClasseCliente {
	
	 

	    public static void main(String[] args) {


	    Cliente01 objeto = new Cliente01();
	    Cliente01 objeto1 = new Cliente01();

	    objeto.setNome("Paulo Brisola"); 
	    objeto.setIdade(31);
	    objeto.setEndereço("Rua do Campo Limpo - 29");
	    objeto.setCpf("230.874.456.20");

	    objeto1.setNome("Pablo Cotrim"); 
	    objeto1.setIdade(22);
	    objeto1.setEndereço("Rua dos Iurutis - 4568");
	    objeto1.setCpf("230.888.745.27");

	    System.out.println("Seu nome é: " + objeto.getNome());
	    System.out.println("A sua idade é: " + objeto.getIdade());
	    System.out.println("Seu endereço: " + objeto.getEndereço());
	    System.out.println("Seu CPF: "+ objeto.getCpf());
	    System.out.println();

	    System.out.println("Seu nome é: " + objeto1.getNome());
	    System.out.println("A sua idade é: " + objeto1.getIdade());
	    System.out.println("Seu endereço é: " + objeto1.getEndereço());
	    System.out.println("Seu CPF: " + objeto1.getCpf());


	    }
	}