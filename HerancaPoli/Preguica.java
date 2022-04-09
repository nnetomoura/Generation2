package HerancaPoli;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
			
	}

	@Override
	public void emitirSom(String emitirSom) 
	{
		System.out.println("O som da preguiça é: " + emitirSom);
		}

	@Override
	public void tipoHabito(String tipoHabito) 
	{
		System.out.println("Sobe em árvores? " + tipoHabito);
	}
	
	public void infoPreguica() 
	{
		System.out.println(">>Informações da Preguiça<<"
				+ "\nNome da preguiça: "+getNome()+"\nIdade: "+getIdade());
	}
	

}
