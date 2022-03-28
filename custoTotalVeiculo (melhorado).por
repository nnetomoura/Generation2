programa
{
	
	
	/*o custo do carro ao consumidor:
	custo de fábrica + disbribuidor e impostos (aplicados ao custo
	de fábrica)
	percentagens: distribuidor = 28%, impostos 45%
	Sistema que leia custo de fábrica e retorne o valor ao consumidor.
	*/
	inclua biblioteca Matematica --> mat // função adicionada para arredondar as saídas
	funcao inicio()
	{
	real custoFabrica, percDistribuidor = 0.0, percImpostos = 0.0, precoFinal //valores zerados (serão calculados)
	escreva("\nInsira o custo de fábrica do veículo: ")
	leia (custoFabrica)

		se (custoFabrica>=0) //''se'' inserido para o caso do usuário inserir uma entrada inválida
		{
		percDistribuidor = custoFabrica * 0.45
		percImpostos = custoFabrica * 0.28
		precoFinal= custoFabrica + percDistribuidor + percImpostos

		escreva("\nPercentual distribuidor: ", "R$",mat.arredondar(percDistribuidor,3),".")
		escreva("\nTotal de impostos: ", "R$", mat.arredondar(percImpostos,3), ".")
		escreva("\nO custo total do carro é: ","R$",mat.arredondar(precoFinal,3),".")
		}

		senao	
		escreva("\nATENÇÃO: Entrada incorreta!!! Insira um valor válido.") //saída para o caso de dados inválidos serem inseridos
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1163; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */