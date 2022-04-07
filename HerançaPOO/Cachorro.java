package HerançaPOO;

public class Cachorro extends Animal{ //informando que esta é uma SUBCLASSE da classe mãe ANIMAL

	private String domestico; //

	public Cachorro(String nome, String especie, String idade, String vocalizacao, String caracteristica,String habitoAlimentar, String domestico) {
	super(nome, especie, idade, vocalizacao, caracteristica, habitoAlimentar);
	this.domestico = domestico; //característica presente apenas na classe Cachorro
}
	public String getDomestico() {
		return domestico;
	}

	public void setDomestico(String domestico) {
		this.domestico = domestico;
	}

	public void infoCachorro () //nome, especie, idade, vocalização, caracteristica,habitoAlimentar,domestico
	{
		System.out.println("\n> Nome popular: "+getNome()+";"+"\n> Espécie: " + getEspecie()+";"+ "\n> Idade: "+ 
	getIdade()+";"+ "\n> Vocalização: " + getVocalizacao()+";"+ "\n> Característica física: "+getCaracteristica()+
	"\n> Hábito alimentar: " + getHabitoAlimentar()+";"+"\n> É um animal domesticado? " + domestico +".");
		
	}
	
	
	
	
	
	
	
	
}
