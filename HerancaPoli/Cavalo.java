package HerancaPoli;

public class Cavalo extends Animal { //inicio da subclasse Animal; 

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void emitirSom(String emitirSom) //polimorfismo: mais de uma versão pra uma mesma coisa;
	{
		System.out.println("O som do cavalo é: "+emitirSom);
		
	}

	@Override
	public void tipoHabito(String tipoHabito) 
	{
		System.out.println("O hábito do cavalo é: "+tipoHabito);
		
	} 
	
	public void infoCavalo()
	{
		System.out.println(">>Informações do Cavalo<<"
				+ "\nNome: " + getNome()+";"+ "\nIdade do cavalo: "+getIdade()+";");
	}
	
	
	
	
	
	
	
	
	
}
