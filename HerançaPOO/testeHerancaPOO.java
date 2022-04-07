package HerançaPOO;

public class testeHerancaPOO {

	public static void main(String[] args) {

		Cachorro testeCachorro = new Cachorro ("Cachorro","Canis lupus familiaris",
		"7 anos","Latido","Corredor","Onívoro","Sim");
		
		Cavalo testeCavalo = new Cavalo ("Cavalo","Equus ferus","5 anos","Relinche",
		"Corredor","Herbívoro","Incapaz de vomitar");
		
		Preguica testePreguica = new Preguica("Preguiça-comum;","Bradypus variegatus;","35 anos;",
		"Silvo agudo;","Não corredora;","Herbívoro;","Defecam uma vez por semana;","Sim.");
				
		testeCachorro.imprimaSeparador();
		testeCachorro.infoCachorro();
		
		testeCavalo.imprimaSeparador();
		testeCavalo.infoCavalo();
		
		testePreguica.imprimaSeparador();
		testePreguica.infoPreguica();
		
		
		
		

	}

}
