package Heran�aPOO; 
//ordem: Animal � classe m�e das subclasses cachorro e cavalo; 
//Cavalo � classe m�e de pregui�a;

public class Preguica extends Cavalo {
	
	private String moveUpTree;
	
	//m�todos construtores 
		public Preguica(String nome, String especie, String idade, String vocalizacao, String caracteristica,
			String habitoAlimentar, String caracExclusiva, String moveUpTree) {
			super(nome, especie, idade, vocalizacao, caracteristica, habitoAlimentar, caracExclusiva);
			this.moveUpTree = moveUpTree; 
	}

	public String getMoveUpTree() {
		return moveUpTree;
	}

	public void setMoveUpTree(String moveUpTree) {
		this.moveUpTree = moveUpTree;
	}
	
	public void infoPreguica ()
	{
		System.out.println("\n> Nome popular: "+getNome()+"\n> Esp�cie: " + getEspecie()+ "\n> Idade: "+ 
				getIdade() + "\n> Vocaliza��o: " + getVocalizacao()+ "\n> Caracter�stica da esp�cie: "+getCaracteristica()+
				"\n> H�bito alimentar: " + getHabitoAlimentar()+"\n> Curiosidade da esp�cie: " + getCaracExclusiva() + "\n> Sobe em �rvores? "+moveUpTree);
	}
	
	
	
		
}
