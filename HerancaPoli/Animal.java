package HerancaPoli;

public abstract class Animal { //a classe DEVE ser abstrata 
		
	private String nome;
	private int idade;
	
	
	public Animal(String nome, int idade) {
	super();
	this.nome = nome;
	this.idade = idade;
		
	}
	//métodos polimórficos (serão sobreescritos)
	abstract public void emitirSom (String emitirSom); //aqui é especificado o "tipo" do método.
	abstract public void tipoHabito (String tipoHabito); //dentro dos parentesis vão os parâmetros para o meu método abstrato;

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
