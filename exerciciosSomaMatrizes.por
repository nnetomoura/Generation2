programa
{
	
	funcao inicio()
	{
		real n1[2][3],n2[2][3],m1[2][3],m2[2][3]
		inteiro i,j

		para(i=0;i<2;i++)
		{
			para(j=0;j<3;j++)
			{
				escreva("\nEntre com o N1: ")
				leia(n1[i][j])
				escreva("\nEntre com o N2: ")
				leia(n2[i][j])
				m1[i][j] = n1[i][j] + n2[i][j]
				m2[i][j] = n1[i][j] - n2[i][j]
			}
		}
		para(i=0;i<2;i++)
		{
			para(j=0;j<3;j++)
			{
				escreva("\nM1: ",m1[i][j])
				escreva("\nM2: ",m2[i][j])
				
			}
		}
	}
} 

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 7, 2}-{n2, 6, 16, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */