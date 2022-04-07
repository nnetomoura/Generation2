package HerançaPOO;

public class Cavalo extends Animal {
	//atributo exclusivo cavalo
	private String caracExclusiva;
	
	//métodos construtores
	public Cavalo(String nome, String especie, String idade, String vocalizacao, String caracteristica,
	String habitoAlimentar, String caracExclusiva) {
	super(nome, especie, idade, vocalizacao, caracteristica, habitoAlimentar);
	this.caracExclusiva = caracExclusiva;
	
	//métodos gerais
	}

	public String getCaracExclusiva() {
		return caracExclusiva;
	}

	public void setCaracExclusiva(String caracExclusiva) {
		this.caracExclusiva = caracExclusiva;
	}
	
	public void infoCavalo ()
	{
		System.out.println("\n> Nome popular: "+getNome()+";"+"\n> Espécie: " + getEspecie()+";"+ "\n> Idade: "+ 
				getIdade()+";"+ "\n> Vocalização: "+ getVocalizacao()+";"+ "\n> Característica: "+getCaracteristica()+";"+
				"\n> Hábito alimentar: " + getHabitoAlimentar()+";"+"\n> Curiosidade da espécie: "+ caracExclusiva+"."); 
	//o atributo ''caracExclusiva'' pertence a própria subclasse, por isso não utilizei o seu "get".
	}
	
	
	
}

