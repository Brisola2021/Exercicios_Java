package Exercicio1;

public class TesteClasseCliente {
	
	 

	    public static void main(String[] args) {


	    Cliente01 objeto = new Cliente01();
	    Cliente01 objeto1 = new Cliente01();

	    objeto.setNome("Paulo Brisola"); 
	    objeto.setIdade(31);
	    objeto.setEndere�o("Rua do Campo Limpo - 29");
	    objeto.setCpf("230.874.456.20");

	    objeto1.setNome("Pablo Cotrim"); 
	    objeto1.setIdade(22);
	    objeto1.setEndere�o("Rua dos Iurutis - 4568");
	    objeto1.setCpf("230.888.745.27");

	    System.out.println("Seu nome �: " + objeto.getNome());
	    System.out.println("A sua idade �: " + objeto.getIdade());
	    System.out.println("Seu endere�o: " + objeto.getEndere�o());
	    System.out.println("Seu CPF: "+ objeto.getCpf());
	    System.out.println();

	    System.out.println("Seu nome �: " + objeto1.getNome());
	    System.out.println("A sua idade �: " + objeto1.getIdade());
	    System.out.println("Seu endere�o �: " + objeto1.getEndere�o());
	    System.out.println("Seu CPF: " + objeto1.getCpf());


	    }
	}