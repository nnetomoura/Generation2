package POO;

public class TesteCliente {

	public static void main(String[] args) {
		//agora iremos instanciar um objeto da classe CLIENTE, que foi criada anteriormente;
		//o que foi feito abaixo? a classe cliente foi chamada, o nome em amarelo foi o nome dado, e depois o ''new cliente'' receber� os dados inseridos;
		Cliente cliente1 = new Cliente ("F�bio Monteiro",28,"fabio email", 98394830914L, "Rua 1");

		//criar s� uma separa��o das informa��es
		
		System.out.println("\n******Informa��es******");
		
		cliente1.imprimaAgora();
		
	}

}
