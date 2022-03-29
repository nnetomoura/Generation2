programa
{
	
	funcao inicio()
	{
			real lancamentos[2]
			real somaLancamentos =0.0, mediaLancamentos=0.0,maiorPontuacao=0.0//para a média 
			inteiro x //variável de contagem
		para(x=0;x<2;x++)
		{

			escreva("\nInsira o resultado do lançamento ", x+1, ":")
			leia(lancamentos[x])
			somaLancamentos += lancamentos[x]
			mediaLancamentos = somaLancamentos/2
	
			se(lancamentos[x] == 6)
			{
				maiorPontuacao++
			}
		}

			escreva("\nA média dos lançamentos foi de: ", mediaLancamentos)
			escreva("\nA maior pontuação do dado foi tirada ",maiorPontuacao, " vez(es).")
	
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 578; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {lancamentos, 6, 8, 11}-{somaLancamentos, 7, 8, 15}-{mediaLancamentos, 7, 30, 16}-{maiorPontuacao, 7, 51, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */