package POO;

public class Cliente1 {

//atributos do cliente
//para dados pessoais, usar o private!	
	
	private String nome;
	private int idade;
	private String telefone;
	private String email;
		
	//métodos construtores
	public Cliente1(String nome, int idade, String telefone, String email) {
	super();
	this.nome = nome;
	this.idade = idade;
	this.telefone = telefone;
	this.email = email;
	
	//métodos gerais 
	
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void imprimaAgora() //nome idade telefone email (n precisa ser na ordem)
	{
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Telefone: " + telefone);
		System.out.println("Email: " + email);
	}
}
