package POO;

public class PrimeiraQuestaoMain {

	/* Crie uma classe CLIENTE e apresente os ATRIBUTOS e M�TODOS referentes a esta classe,
	 em seguida crie um OBJETO cliente, defina as inst�ncias deste objeto e apresente as informa��es
	 deste objeto no console. 
	 */
	public static void main(String[] args) {
	
	Cliente1 cliente = new Cliente1 ("Cl�udio Pereira" ,27 ,"(81)982069518l", "claudio.prepara0@gmail.com"); //nome idade telefone email

	System.out.println("*******Informa��es*******");
	
	cliente.imprimaAgora();
		
	}

}
