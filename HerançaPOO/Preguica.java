package HerançaPOO; 
//ordem: Animal é classe mãe das subclasses cachorro e cavalo; 
//Cavalo é classe mãe de preguiça;

public class Preguica extends Cavalo {
	
	private String moveUpTree;
	
	//métodos construtores 
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
		System.out.println("\n> Nome popular: "+getNome()+"\n> Espécie: " + getEspecie()+ "\n> Idade: "+ 
				getIdade() + "\n> Vocalização: " + getVocalizacao()+ "\n> Característica da espécie: "+getCaracteristica()+
				"\n> Hábito alimentar: " + getHabitoAlimentar()+"\n> Curiosidade da espécie: " + getCaracExclusiva() + "\n> Sobe em árvores? "+moveUpTree);
	}
	
	
	
		
}
