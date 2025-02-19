package model;

public class Pessoa {
	//
	// ATRIBUTOS
	//
	private String cpf;   // tipo do atributo cpf: Ponteiro para (um objeto) String
	private String nome;  // tipo do atributo nome: Ponteiro para (um objeto) String
	private int    idade; // tipo do atributo idade: int (tipo primitivo)

	//
	// MÉTODOS
	// 
	/**
	 * MÉTODO CONSTRUTOR da classe Pessoa. Sempre que um objeto Pessoa for criado com o
	 * operador 'new', o novo objeto irá executar este método. É o método responsável 
	 * pela inicialização do objeto recém-criado. 
	 * 
	 * @param c ponteiro para String - Aponta para a String que determina o cpf da Pessoa
	 * @param n ponteiro para String - Aponta para a String que determina o nome da Pessoa
	 * @param i int - determina o valor da idade da Pessoa
	 */
	public Pessoa(String c, String n, int i) {
		// Chamada ao construtor da superclasse (Object) - tópico futuro
		super();		
		
		// Observações
		// ===========
		// 'this': referência para o objeto que estiver executando o método. 
		//  Se um método está sendo executado, então 'this' aponta para esse objeto.
		// 
		// TODO A forma como inicializamos os atributos neste método construtor será alterada no futuro!
		
		// Estamos pedindo ao 'this' que copie o valor de 'c' e guarde em seu 
		// atributo 'cpf'. Isso fará com que o atributo 'cpf' do 'this' aponte 
		// para a mesma String apontada por 'c' 
		this.cpf = c;
		// Estamos pedindo ao 'this' que copie o valor de 'n' e guarde em seu 
		// atributo 'nome'. Isso fará com que o atributo 'nome' do 'this' aponte 
		// para a mesma String apontada por 'n' 
		this.nome = n;
		// Estamos pedindo ao 'this' que copie o valor de 'i' e guarde em seu 
		// atributo 'idade'. Isso fará com que o atributo 'idade' do 'this' tenha
		// o mesmo valor de 'i'
		this.idade = i;

	}
	
	/**
	 * Método que retorna a referência para a String que contém o cpf da Pessoa
	 * @return
	 */
	public String getCpf() {
		return this.cpf;
	}
	
	/**
	 * Método que altera o atributo 'cpf', fazendo com que aponte para outra String
	 * que contém o novo cpf
	 * @param novoCpf
	 */
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	
	/**
	 * Método que retorna a referência para a String que contém o nome da Pessoa
	 * @return
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Método que altera o atributo 'nome', fazendo com que aponte para outra String
	 * que contém o novo nome
	 * @param novoNome
	 */
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	/**
	 * Método que retorna a idade da Pessoa
	 * @return
	 */
	public int getIdade() {
		return this.idade;
	}

	/**
	 * Método que altera o atributo 'idade', fazendo com que armazene um novo valor 
	 * para idade 
	 * @param novaIdade
	 */
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}	
}