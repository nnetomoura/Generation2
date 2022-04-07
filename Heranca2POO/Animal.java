package Heranca2POO;

public class Animal {
	//atributos da classe m�e
	
	private String nome;
	private int idade;
	private String som;
	private String correr;
	
	//m�todos construtores
	public Animal(String nome, int idade, String som, String correr) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som; 
		this.correr = correr;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void imprimaSeparador ()
	{
		System.out.println("*************************************");
	}
	
	
}
