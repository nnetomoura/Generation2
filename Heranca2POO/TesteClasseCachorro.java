package Heranca2POO;

public class TesteClasseCachorro {

	public static void main(String[] args) {
	
	Cachorro testeCachorro = new Cachorro ("Xolinha;",5,"Latido (au au!!!!);",
	"Sim;","Caramelo.");
	Cavalo testeCavalo = new Cavalo ("Robson;",4,"Relinche;","Sim.","P�-de-pano");
	Preguica testePreguica = new Preguica("Preguicinha",25,"Silvo agudo.","N�o;","Sim.");
	//sa�das cachorro
	testeCachorro.imprimaSeparador();
	testeCachorro.imprimirInfoDog();
	//sa�das cavalo
	testeCavalo.imprimaSeparador();
	testeCavalo.imprimirInfoCavalo();
	//sa�das Pregui�a
	testePreguica.imprimaSeparador();
	testePreguica.imprimirInfoPreg();

	}

}
