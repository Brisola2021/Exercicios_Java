package ExerciciosHeranca;

/*
 * 1 Crie uma hierarquia de classes conforme abaixo 
 * com os seguintes atributos e comportamentos 
 * (observe a tabela), utilize os seus conhecimentos 
 * e distribua as características de forma que 
 * tudo o que for comum a todos os animais fique 
 * na classe Animal:
 */
public class TestaDados {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		Animal a3 = new Animal();
		Cachorro c = new Cachorro();
		Cavalo cv = new Cavalo();
		Preguiça preguica = new Preguiça();
		
		a1.setNome("Cahorro");
		a1.setIdade("10");
		a1.setSom("Latido");
		a1.setEspecie("Canis lupus");
		c.setLocomocao1("corre");
		c.setPontoForte("Olfato");
		
		a2.setNome("Cavalo");
		a2.setIdade("25");
		a2.setSom("Relinche");
		a2.setEspecie("Equus ferus");
		cv.setLocomocao2("Galopa");
		cv.setPontoForte2("Resistencia");
		
		a3.setNome("Preguiça");
		a3.setIdade("25");
		a3.setSom("Grunhido");
		a3.setEspecie("Bradypus tridactylus");
		preguica.setLocomocao3("Escala");
		preguica.setPontoForte3("Mergulhadora");
		
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade());
		System.out.println("Som: " + a1.getSom());
		System.out.println("Especie: " + a1.getEspecie());
		System.out.println("Locomocao: " + c.getLocomocao1());
		System.out.println("Ponto Forte: " + c.getPontoForte());
		
		System.out.println("\nNome: " + a2.getNome());
		System.out.println("Idade: " + a2.getIdade());
		System.out.println("Som: " + a2.getSom());
		System.out.println("Especie: " + a2.getEspecie());
		System.out.println("Locomocao: " + cv.getLocomocao2());
		System.out.println("Ponto Forte: " + cv.getPontoForte2());

		System.out.println("\nNome: " + a3.getNome());
		System.out.println("Idade: " + a3.getIdade());
		System.out.println("Som: " + a3.getSom());
		System.out.println("Especie: " + a3.getEspecie());
		System.out.println("Locomocao: " + preguica.getLocomocao3());
		System.out.println("Ponto Forte: " + preguica.getPontoForte3());
	}

}
