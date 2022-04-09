package HerancaPoli;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom(String somAnimal) {
		
		System.out.println("Som emitido: " + somAnimal);
		
	}

	@Override
	public void tipoHabito(String tipoHabito) {
		System.out.println("Tipo de h�bito: "+ tipoHabito);
		
	}
	
	public void infoCachorro ()
	{
		System.out.println(">>Informa��es do cachorro<<"
				+ "\nNome do cachorro: " + getNome()+ "\nIdade do cachorro: " + getIdade());
	}

		
	
}
