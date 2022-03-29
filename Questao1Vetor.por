programa
{
/*
Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
	
	funcao inicio()
	{
		real notas[5], maiorNota =0.0
		inteiro x
		para(x=0;x<5;x++)
		{
		escreva("\nInsira a pontuação ", x+1, ":")
		leia(notas[x])
		limpa()
		
		se (notas[x]>maiorNota)
		{maiorNota = notas[x]}}
		
		
		escreva("\nAs notas inseridas foram: ")
		
		para(x=0;x<5;x++)
		{
		escreva("\n", x+1, "ª ", notas[x])
		}
		
		escreva("\nA maior nota foi: ", maiorNota)
}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 10, 7, 5}-{maiorNota, 10, 17, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */