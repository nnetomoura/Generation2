package Heran�aPOO;

public class Cavalo extends Animal {
	//atributo exclusivo cavalo
	private String caracExclusiva;
	
	//m�todos construtores
	public Cavalo(String nome, String especie, String idade, String vocalizacao, String caracteristica,
	String habitoAlimentar, String caracExclusiva) {
	super(nome, especie, idade, vocalizacao, caracteristica, habitoAlimentar);
	this.caracExclusiva = caracExclusiva;
	
	//m�todos gerais
	}

	public String getCaracExclusiva() {
		return caracExclusiva;
	}

	public void setCaracExclusiva(String caracExclusiva) {
		this.caracExclusiva = caracExclusiva;
	}
	
	public void infoCavalo ()
	{
		System.out.println("\n> Nome popular: "+getNome()+";"+"\n> Esp�cie: " + getEspecie()+";"+ "\n> Idade: "+ 
				getIdade()+";"+ "\n> Vocaliza��o: "+ getVocalizacao()+";"+ "\n> Caracter�stica: "+getCaracteristica()+";"+
				"\n> H�bito alimentar: " + getHabitoAlimentar()+";"+"\n> Curiosidade da esp�cie: "+ caracExclusiva+"."); 
	//o atributo ''caracExclusiva'' pertence a pr�pria subclasse, por isso n�o utilizei o seu "get".
	}
	
	
	
}

