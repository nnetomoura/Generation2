package HerancaPoli;

public class Cavalo extends Animal { //inicio da subclasse Animal; 

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom(String emitirSom) //polimorfismo: mais de uma vers�o pra uma mesma coisa;
	{
		System.out.println("O som do cavalo �: "+emitirSom);
		
	}

	@Override
	public void tipoHabito(String tipoHabito) 
	{
		System.out.println("O h�bito do cavalo �: "+tipoHabito);
		
	} 
	
	public void infoCavalo()
	{
		System.out.println(">>Informa��es do Cavalo<<"
				+ "\nNome: " + getNome()+";"+ "\nIdade do cavalo: "+getIdade()+";");
	}
	
	
	
	
	
	
	
	
	
}
