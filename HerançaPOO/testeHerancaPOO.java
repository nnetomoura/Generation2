package Heran�aPOO;

public class testeHerancaPOO {

	public static void main(String[] args) {

		Cachorro testeCachorro = new Cachorro ("Cachorro","Canis lupus familiaris",
		"7 anos","Latido","Corredor","On�voro","Sim");
		
		Cavalo testeCavalo = new Cavalo ("Cavalo","Equus ferus","5 anos","Relinche",
		"Corredor","Herb�voro","Incapaz de vomitar");
		
		Preguica testePreguica = new Preguica("Pregui�a-comum;","Bradypus variegatus;","35 anos;",
		"Silvo agudo;","N�o corredora;","Herb�voro;","Defecam uma vez por semana;","Sim.");
				
		testeCachorro.imprimaSeparador();
		testeCachorro.infoCachorro();
		
		testeCavalo.imprimaSeparador();
		testeCavalo.infoCavalo();
		
		testePreguica.imprimaSeparador();
		testePreguica.infoPreguica();
		
		
		
		

	}

}
