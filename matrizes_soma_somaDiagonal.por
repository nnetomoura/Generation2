programa
{
	/*
Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		real matriz1[3][3], somaMatriz = 0.0, somaDiagonal = 0.0
		inteiro x,y

		para (x=0;x<3;x++)
		{
			para (y=0;y<3;y++)
			{
				escreva("\nEntre com o valor: ")
				leia(matriz1[x][y])
				somaMatriz += matriz1[x][y]  
				somaDiagonal = matriz1[0][0] + matriz1[1][1] + matriz1[2][2] //ou seria só colocar um ''se'' i==j 
				
			}
		}
				escreva("\nA soma dos valores da matriz foi: ", somaMatriz)
				escreva("\nA soma dos valores da diagonal principal foi: ", somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 724; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz1, 10, 7, 7}-{somaMatriz, 10, 22, 10}-{somaDiagonal, 10, 40, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */