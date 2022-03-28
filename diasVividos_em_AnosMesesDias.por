programa
{
	
	funcao inicio()
	{
		inteiro dias, meses, anos, resto, diasVividos
	

		escreva("\nEntre com os dias vividos: ")
		leia(dias)
	
		anos = dias / 365 //essa divisão nos dará os anos vividos até então (precisaremos do seu resto);
		resto = dias % 365 //aqui, atribuímos a variável ''resto'' o resto da divisão anterior (anos = ...)
		meses = resto / 12 // agora, teremos os meses. resto (em dias) dos anos vividos / 12 (12 meses em 1 ano)
		dias = meses % 12 // agora os dias serão apenas o resto da divisão dos meses, sem a necessidade de outras operações matemáticas.

		//depois dos cáuculos serem feitos, é só ''printar'' as respostas de cada variável.

		escreva ("\nAnos vividos até o momento: ",anos, ".")
		escreva ("\nMeses vividos até o momento: ",meses, ".")
		escreva ("\nDias vividos até o momento: ",dias, ".")
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 261; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */