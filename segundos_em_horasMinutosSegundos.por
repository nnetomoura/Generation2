programa
{
	
	funcao inicio()
	{
	inteiro segundos, horas, minutos, resto
	
	escreva("\n===TRANSFORMANDO SEGUNDOS EM HORAS, MINUTOS E SEGUNDOS===")
	escreva("\nInsira o total de segundos: ")
	leia(segundos)

	horas = segundos / 3600 //
	resto = segundos % 3600
	minutos = resto / 60
	segundos = resto % 60

	escreva("\nHoras trabalhadas até agora: ", horas, ".")
	escreva("\nMinutos trabalhados até agora: ", minutos, ".")
	escreva("\nSegundos trabalhados até agora: ", segundos, ".")
	
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */