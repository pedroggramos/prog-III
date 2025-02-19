package controller;

import model.Pessoa;

public class CtrlPrograma {
	public static void main(String[] args) {
		//
		// Nesta primeira instrução, temos a declaração da variável 'p1'. Como o que
		// está escrito à esquerda NÃO corresponde a um tipo primitivo, então o tipo
		// de p1 é "ponteiro para (um objeto) Pessoa.
		//
		// Nesta instrução também vemos a presença de dois operadores: = e new. O 
		// primeiro operador a ser executado é o 'new'.
		//
		// O operador 'new' é responsável por criar um novo objeto. Para isso fará duas
		// coisas: (1) vai alocar um bloco de memória para o novo objeto e (2) vai pedir
		// ao novo objeto que execute o seu MÉTODO CONSTRUTOR. Ao final, o operador new
		// vai retornar o endereço de memória onde o novo objeto foi criado.
		//
		// ATENÇÃO: o método construtor NÃO é executado pelo 'new'; quem executa o método
		// construtor é o objeto recém-criado (o new só pede para que ele execute o método)
		// 
		// Nesta instrução, vemos a presença de duas LITERAIS STRING. String não é tipo
		// primitivo; corresponde a uma classe. Para criarmos objetos String, não é 
		// necessário usarmos o operador new, basta escrevermos uma literal String. O 
		// compilador colocará no local da literal String o endereço de memória onde o 
		// objeto String foi criado.
		//
		Pessoa p1 = new Pessoa("123.456.789-09","José da Silva",23);
		// Irá imprimir o resultado do método toString() - tópico futuro. Por enquanto
		// observe que ele imprime o nome da classe e um endereço de memória
		System.out.println(p1);
		// Nesta instrução temos 'p1.getNome()' e 'p1.getIdade()' correspondendo ao 
		// envio de mensagem para o objeto apontado por p1. No primeiro estamos mandando
		// a mensagem 'getNome()' para o objeto apontado por p1. Quando o objeto recebe
		// a mensagem, ele irá executar o método 'getNome()'. A mesma coisa acontece com
		// 'getIdade()
		System.out.println("p1 está apontando para um objeto Pessoa cujo nome é: " +  p1.getNome() + 
				           " e sua idade é " + p1.getIdade());
		
		// Repetimos as mesmas três operações acima
		Pessoa p2 = new Pessoa("098.765.432-10","Maria de Souza",21);
		System.out.println(p2);
		System.out.println("p2 está apontando para outro objeto Pessoa cujo nome : " +  p2.getNome() +
                           " e sua idade é " + p2.getIdade());
		
		// Declaramos a variável 'p3' e ela apontará para o mesmo objeto apontado por p1
		Pessoa p3 = p1;
		System.out.println(p3);
		
		// Mandamos para o objeto apontado por 'p3' que execute o método 'setNome'
		p3.setNome("Theóphilo Epaminondas");
		// Mandamos para o objeto apontado por 'p3' que execute o método 'setIdade'
		p3.setIdade(55);

		// Mandamos imprimir nome e idade do objeto apontado por 'p1'. Observe que ele 
		// vai imprimir os valores usados para alteração nas duas instruções anteriores.
		// Isso prova que 'p1' e 'p3' estão apontando para o mesmo objeto.
		System.out.println("p1 está apontando para um objeto Pessoa cujo nome é: " +  p1.getNome() + 
		           " e sua idade é " + p1.getIdade());		
		
		// Observação final: 
		// Por que é importante saber que o tipo de 'p1', 'p2' e 'p3' é 'Ponteiro para Pessoa'? 
		// Se falássemos que o tipo dessas variáveis é 'Pessoa', poderíamos pensar que 
		// essas variáveis armazenariam um objeto Pessoa e que a instrução "p3 = p1;" iria
		// copiar o objeto dentro de 'p1'. Se fosse assim, as alterações que fizemos acima 
		// usando 'p3' (setNome e setIdade) não afetariam o resultado da última impressão 
		// que usa 'p1', pois seriam "objetos diferentes". OBSERVE QUE ISSO NÃO É VERDADE. 
		// Por isso é importante guardar que 'p1', 'p2' e 'p3' são 'PONTEIROS PARA PESSOA'. 
	}
}