programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	real a=0.0, b=0.0, c=0.0, D,R,S

	escreva("\nInsira o valor de A: ")
	leia(a)
	limpa() //para limpar cada entrada de dados (visual amigável para o usuário)
	escreva("\nInsira o valor de B: ")
	leia(b)
	limpa()
	escreva("\nInsira o valor de C: ")
	leia(c)
	limpa()
	
	R = mat.potencia((a+b), 2.0)
	S = mat.potencia((b+c), 2.0)
	D = (R + S) / 2
		
		
	escreva("\nO valor de D é ", mat.arredondar(D,2), "!") 
	
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 81; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */