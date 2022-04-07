package POO;

public class PrimeiraQuestaoMain {

	/* Crie uma classe CLIENTE e apresente os ATRIBUTOS e MÉTODOS referentes a esta classe,
	 em seguida crie um OBJETO cliente, defina as instâncias deste objeto e apresente as informações
	 deste objeto no console. 
	 */
	public static void main(String[] args) {
	
	Cliente1 cliente = new Cliente1 ("Cláudio Pereira" ,27 ,"(81)982069518l", "claudio.prepara0@gmail.com"); //nome idade telefone email

	System.out.println("*******Informações*******");
	
	cliente.imprimaAgora();
		
	}

}
