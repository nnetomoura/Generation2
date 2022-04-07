package HerançaPOO;

public class Animal {
	
	//atributos 
	private String nome; 
	private String especie; //(genero) + epiteto específico
	private String idade;
	private String vocalizacao;
	private String caracteristica;
	private String habitoAlimentar; //a mais
	//só a preguiça não corre! ela sobe em árvores; 
	
	//métodos construtores 
	
	public Animal(String nome, String especie, String idade, String vocalizacao, String caracteristica,
			String habitoAlimentar) {
		super(); //indicador de superClasse
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
		this.vocalizacao = vocalizacao;
		this.caracteristica = caracteristica;
		this.habitoAlimentar = habitoAlimentar;
	
	//métodos gerais
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getVocalizacao() {
		return vocalizacao;
	}

	public void setVocalizacao(String vocalizacao) {
		this.vocalizacao = vocalizacao;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getHabitoAlimentar() {
		return habitoAlimentar;
	}

	public void setHabitoAlimentar(String habitoAlimentar) {
		this.habitoAlimentar = habitoAlimentar;
	}
	
	public void imprimaSeparador()
	{
		System.out.println("\n**************************************");
	}
	
	
	
	

	
	


}
