package POO;

public class Aviao {
	
	//atributos: // 
	
	private String piloto;
	private String compAerea;
	private	String modeloAviao;
	private String anoFabricacao; 
	private double numDeSerie;  //substituir por String. Mas assim tamb�m est� correto.
	private int horasVoo;

	//m�todos construtores:
	public Aviao(String piloto, String compAerea, String modeloAviao, String anoFabricacao, double numDeSerie,
	int horasVoo) {
		super();
		this.piloto = piloto;
		this.compAerea = compAerea;
		this.modeloAviao = modeloAviao;
		this.anoFabricacao = anoFabricacao;
		this.numDeSerie = numDeSerie;
		this.horasVoo = horasVoo;
	
	}

	//m�todos gerais (get set)
	
	public String getPiloto() {
		return piloto;
	}
	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
	public String getCompAerea() {
		return compAerea;
	}
	public void setCompAerea(String compAerea) {
		this.compAerea = compAerea;
	}
	public String getModeloAviao() {
		return modeloAviao;
	}
	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}
	public String getanoFabricacao() {
		return anoFabricacao;
	}
	public void setanoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getNumDeSerie() {
		return numDeSerie;
	}
	public void setNumDeSerie(double numDeSerie) {
		this.numDeSerie = numDeSerie;
	}
	public int getHorasVoo() {
		return horasVoo;
	}
	public void setHorasVoo(int horasVoo) {
		this.horasVoo = horasVoo;
	}
	
   //m�todo criado por mim (far� o que eu quiser);
	
	public void imprimaAgora() //piloto compAerea modeloAviao anoFabricacao, numDeSerie, horasVoo
	{
		System.out.println("Nome do piloto: " +piloto+".");
		System.out.println("Companhia a�rea:" +compAerea+".");
		System.out.println("Modelo da aeronave: " +modeloAviao+".");
		System.out.println("Ano de fabrica��o: "+anoFabricacao+".");
		System.out.println("N�mero de s�rie da aeronave: " + numDeSerie+".");
		System.out.println("Horas voadas: " + horasVoo+".");
		
	}
}
