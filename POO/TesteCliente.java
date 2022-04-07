package POO;

public class TesteCliente {

	public static void main(String[] args) {
		//agora iremos instanciar um objeto da classe CLIENTE, que foi criada anteriormente;
		//o que foi feito abaixo? a classe cliente foi chamada, o nome em amarelo foi o nome dado, e depois o ''new cliente'' receberá os dados inseridos;
		Cliente cliente1 = new Cliente ("Fábio Monteiro",28,"fabio email", 98394830914L, "Rua 1");

		//criar só uma separação das informações
		
		System.out.println("\n******Informações******");
		
		cliente1.imprimaAgora();
		
	}

}
