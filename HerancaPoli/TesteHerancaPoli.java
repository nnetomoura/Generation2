package HerancaPoli;

public class TesteHerancaPoli {

	public static void main(String[] args) {
		
		Cachorro testeDog = new Cachorro ("Tobias",10);
		Cavalo testeCavalo = new Cavalo ("Pé-de-Pano",35);
		Preguica testePreguica = new Preguica ("Wanda",20);
		//cachorro
		testeDog.infoCachorro();
		testeDog.emitirSom("Latido - au au au au;");
		testeDog.tipoHabito("Corredor");
		testeDog.imprimaSeparador();
		
		//cavalo
		testeCavalo.infoCavalo();
		testeCavalo.emitirSom("Relinche irrirrirri");
		testeCavalo.tipoHabito("Corredor");
		testeCavalo.imprimaSeparador();
		
		//preguica
		testePreguica.infoPreguica();
		testePreguica.emitirSom("Silvo agudo (piiiiiii)");
		testePreguica.tipoHabito("Sim! Sobe em árvores");
		testePreguica.imprimaSeparador();

	}

}
