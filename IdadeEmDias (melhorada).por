programa
{
	
	funcao inicio()
	{
	//programa que leia a idade em anos, meses e dias;
	//e que retorne apenas a quantidade de dias
	//cálculos a serem feitos: 

	inteiro anos, anosEmDias = 0, meses, mesesVividos, diaDoMes = 0, totalDias = 0
		
	escreva("\nEntre com a sua idade (ex: 25): ")
	leia(anos)
	limpa()
		
		se(anos>120) 
				{
				escreva("ENTRADA INVÁLIDA! Você não pode ter vivido tanto!!!")
				}

					senao 		
					{
					escreva("\nQual o número correspondente ao mês atual (ex: junho = 6)? ")
					leia(meses)
					limpa()
		
						se(meses>12)
						{escreva("\nENTRADA INVÁLIDA! Não existe nenhum mês com esse valor!!!")}
		
								senao 
									{escreva("\nPor fim, insira o dia do mês (ex: 10): ")
									leia(diaDoMes)
									limpa()
	
										se(diaDoMes<30){
										anosEmDias = anos * 365
										mesesVividos = meses * 30
										totalDias = anosEmDias+ mesesVividos + diaDoMes
												escreva("\nVocê viveu ", totalDias, " até hoje! Está na flor da idade!")}
	
														senao		
														escreva("ENTRADA INVÁLIDA! O limite de dias em um mês é 30.")}}

	

		
		
		

		
	
	

	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 271; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */