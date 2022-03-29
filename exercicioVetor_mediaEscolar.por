programa
{
	inclua biblioteca Matematica --> mat
//exercício vetores
/*Programa que leia notas e mostre. Além, some as médias e média geral.
*/	
	funcao inicio()
	{
	real mediaNotas[4], n1, n2, n3, mediaGeral, somaMedia = 0.0
	inteiro x
	//variável media: onde as médias serão guardadas. Por ser um vetor, cada uma delas poderá ser acessada posteriormente.
	//lembrando que vetores são contados a partir de 0. Se media [4], logo, 0, 1, 2, 3 (4 valores em 4 posições)
	//n1, 2 e 3: notas que serão inseridas (entrada de dados);
	//mediaGeral = media geral da turma = somaMedia/quantidade de alunos (nesse caso, 4)
	//somaMedia = onde as notas somadas ficarão ''guardadas''.
	//inteiro x = variável que guardará a ORDEM dos dados inseridos (para buscar depois). Por ex: nota 1 será guardada na posição 0 do vetor.

	para(x=0;x<4;x++) //"x=0" = início do parâmetro, "x<4" = limite do parâmetro (n pode ser >= pois explodiria o limite), "x++", variável de contagem
	{
		escreva("\nEntre com a primeira nota: ")
		leia(n1)
		
		escreva("\nEntre com a segunda nota: ")
		leia(n2)
		
		escreva("\nEntre com a terceira nota: ")
		leia(n3)
		limpa() 

		mediaNotas[x] = (n1+n2+n3) / 3 // divisão por 3 por serem 3 notas;
		somaMedia += mediaNotas[x] //isso é o mesmo que: somaMedia = somaMedia + media[x]
		
	}
	para(x=0;x<4;x++)
	{
		escreva("\nA média do alune ", x+1, " de ", mat.arredondar(mediaNotas[x],2)) //neste caso o x+1 serve somente para uma melhor visualização da posição, para que não comece no aluno ''zero'' (início do vetor)
	}

	//agora faremos a função que irá ''printar'' as médias de cada alune
	
	mediaGeral = somaMedia / 4 //4 alunos nesta turma
	escreva("\nMédia da turma: ", mat.arredondar(mediaGeral,2))
	
	
	

	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1405; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mediaNotas, 9, 6, 10}-{n1, 9, 21, 2}-{n2, 9, 25, 2}-{n3, 9, 29, 2}-{x, 10, 9, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */