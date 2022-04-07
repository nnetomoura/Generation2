package POO;

public class Cliente {

	//criando atributos (variáveis) da CLASSE cliente, ou seja, o que o cliente ''tem''?
	//uma boa prática é colocar ''dados'' como private.
	//quando os gets and sets forem criados o grifo amarelo sairá;
	//os atributos do cliente quem decide somos nós! pode ser qualquer coisa.	
	private String nomeCliente;
	private int idade;
	private String email;
	private double cpf;
	private String endereco;
	
	//método construtor
	//ele dirá qual que vai ser a essência das variáveis!
	//o método construtor ter o mesmo nome da classe é uma boa prática!
	//o que está nos atributos e no construtor tem nomes iguais, mas são coisas diferentes!
	
	public Cliente(String nomeCliente, int idade, String email, double cpf, String endereco) 

	{
		super();
		this.nomeCliente = nomeCliente; //estou dizendo que o this.nomeCliente = nomeCliente é da MINHA classe local.
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	//métodos gerais: são usados para podermos printar na tela. 
	//o get ACESSA a informação e TEM retorno (indicado pelo void);
	//o set não, ele só irá servirá para modificar algo (não tem return, portanto não tem void);
		
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	//criando um método para ser feito
	
	public void imprimaAgora()
	{
		System.out.println("Nome:" +nomeCliente+".");
		System.out.println("Nome:" +idade+".");
		System.out.println("Nome:" +email+".");
		System.out.println("Nome:" +cpf+".");
		System.out.println("Nome:" +endereco+".");

	}
	
	
	
	
	
	
}
