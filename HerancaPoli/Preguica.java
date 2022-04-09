package HerancaPoli;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
			
	}

	@Override
	public void emitirSom(String emitirSom) 
	{
		System.out.println("O som da pregui�a �: " + emitirSom);
		}

	@Override
	public void tipoHabito(String tipoHabito) 
	{
		System.out.println("Sobe em �rvores? " + tipoHabito);
	}
	
	public void infoPreguica() 
	{
		System.out.println(">>Informa��es da Pregui�a<<"
				+ "\nNome da pregui�a: "+getNome()+"\nIdade: "+getIdade());
	}
	

}
