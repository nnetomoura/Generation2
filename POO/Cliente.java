package POO;

public class Cliente {

	//criando atributos (vari�veis) da CLASSE cliente, ou seja, o que o cliente ''tem''?
	//uma boa pr�tica � colocar ''dados'' como private.
	//quando os gets and sets forem criados o grifo amarelo sair�;
	//os atributos do cliente quem decide somos n�s! pode ser qualquer coisa.	
	private String nomeCliente;
	private int idade;
	private String email;
	private double cpf;
	private String endereco;
	
	//m�todo construtor
	//ele dir� qual que vai ser a ess�ncia das vari�veis!
	//o m�todo construtor ter o mesmo nome da classe � uma boa pr�tica!
	//o que est� nos atributos e no construtor tem nomes iguais, mas s�o coisas diferentes!
	
	public Cliente(String nomeCliente, int idade, String email, double cpf, String endereco) 

	{
		super();
		this.nomeCliente = nomeCliente; //estou dizendo que o this.nomeCliente = nomeCliente � da MINHA classe local.
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	//m�todos gerais: s�o usados para podermos printar na tela. 
	//o get ACESSA a informa��o e TEM retorno (indicado pelo void);
	//o set n�o, ele s� ir� servir� para modificar algo (n�o tem return, portanto n�o tem void);
		
	
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
	
	//criando um m�todo para ser feito
	
	public void imprimaAgora()
	{
		System.out.println("Nome:" +nomeCliente+".");
		System.out.println("Nome:" +idade+".");
		System.out.println("Nome:" +email+".");
		System.out.println("Nome:" +cpf+".");
		System.out.println("Nome:" +endereco+".");

	}
	
	
	
	
	
	
}
