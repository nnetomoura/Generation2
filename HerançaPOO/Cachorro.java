package Heran�aPOO;

public class Cachorro extends Animal{ //informando que esta � uma SUBCLASSE da classe m�e ANIMAL

	private String domestico; //

	public Cachorro(String nome, String especie, String idade, String vocalizacao, String caracteristica,String habitoAlimentar, String domestico) {
	super(nome, especie, idade, vocalizacao, caracteristica, habitoAlimentar);
	this.domestico = domestico; //caracter�stica presente apenas na classe Cachorro
}
	public String getDomestico() {
		return domestico;
	}

	public void setDomestico(String domestico) {
		this.domestico = domestico;
	}

	public void infoCachorro () //nome, especie, idade, vocaliza��o, caracteristica,habitoAlimentar,domestico
	{
		System.out.println("\n> Nome popular: "+getNome()+";"+"\n> Esp�cie: " + getEspecie()+";"+ "\n> Idade: "+ 
	getIdade()+";"+ "\n> Vocaliza��o: " + getVocalizacao()+";"+ "\n> Caracter�stica f�sica: "+getCaracteristica()+
	"\n> H�bito alimentar: " + getHabitoAlimentar()+";"+"\n> � um animal domesticado? " + domestico +".");
		
	}
	
	
	
	
	
	
	
	
}
