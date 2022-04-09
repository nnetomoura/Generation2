package HerancaPoli;

public abstract class Animal { //a classe DEVE ser abstrata 
		
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
	super();
	this.nome = nome;
	this.idade = idade;
		
	}
	//m�todos polim�rficos (ser�o sobreescritos)
	abstract public void emitirSom (String emitirSom); //aqui � especificado o "tipo" do m�todo.
	abstract public void tipoHabito (String tipoHabito); //dentro dos parentesis v�o os par�metros para o meu m�todo abstrato;

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
		
	public void imprimaSeparador () 
	{
		System.out.println("\n*******************************");
	}



	
	
	
	
	
	
	
	

	
		
}
