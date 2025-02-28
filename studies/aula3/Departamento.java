package model;

public class Departamento {
	//
	// ATRIBUTOS
	//
	private String sigla;
	private String nome;
	
	//
	// MÉTODOS
	//
	/**
	 * Método construtor de Departamento
	 */
	public Departamento(String sigla, String nome) {
		super();
		// Enviamos a mensagem 'setSigla' para o objeto 
		// que estiver executando este construtor.
		this.setSigla(sigla);
		// Enviamos a mensagem 'setNome' para o objeto 
		// que estiver executando este construtor.
		this.setNome(nome);
	}

	/**
	 * Retorna a sigla do Deparamento
	 */
	public String getSigla() {
		return this.sigla;
	}

	/**
	 * Altera a sigla do Departamento, desde que o parâmetro seja válido
	 */
	public void setSigla(String sigla) {
		// Se o parâmetro 'sigla' é válido, fazemos a atribuição
		if(this.validarSigla(sigla))
			this.sigla = sigla;
	}

	/**
	 * Retorna o nome do Departamento
	 */
	public String getNome() {
		return this.nome;
	}

	/**
	 * Altera o nome do Departamento, desde que o parâmetro seja válido
	 */
	public void setNome(String nome) {
		// Se o parâmetro 'nome' é válido, fazemos a atribuição
		if(this.validarSigla(nome))
			this.nome = nome;
	} 

	/**
	 * Verifica se o parâmetro passado corresponde a uma sigla válida
	 */
	// TODO Essa forma de validação será refeita na próxima aula
	public boolean validarSigla(String sigla) {
		// Se 'sigla' aponta para null OU se o tamanho da String apontado por 'sigla'
		// é zero, retornamos 'false'. Observe que 'sigla.length()' corresponde ao 
		// envio da mensagem 'length()' para o objeto apontado por 'sigla'
		if(sigla == null || sigla.length() == 0)
			return false; 
		// Vamos verificar cada caracter na String apontada por sigla
		for(int i = 0; i < sigla.length(); i++) {
			// A mensagem 'charAt(i)' retorna o caracter presente na posição 'i'
			char c = sigla.charAt(i);
			// Se o caracter NÃO é alfabético, retornamos 'false'
			if( ! Character.isAlphabetic(c))
				return false;
		}
		// Todas as verificações foram feitas. Retornamos 'true'
		return true;
	}
	
	/**
	 * Verifica se o parâmetro passado corresponde a um nome válido
	 */
	// TODO Essa forma de validação será refeita na próxima aula
	public boolean validarNome(String nome) {
		// Se 'nome' aponta para null OU se o tamanho da String apontado por 'nome'
		// é zero, retornamos 'false'. Observe que 'nome.length()' corresponde ao 
		// envio da mensagem 'length()' para o objeto apontado por 'nome'
		if(nome == null || nome.length() == 0)
			return false; 
		// Vamos verificar cada caracter na String apontada por 'nome'
		for(int i = 0; i < nome.length(); i++) {
			// A mensagem 'charAt(i)' retorna o caracter presente na posição 'i'
			char c = nome.charAt(i);
			// Se o caracter NÃO é alfabético E também não é espaço em branco
			// retornamos 'false'
			if( !Character.isAlphabetic(c) && !Character.isSpaceChar(c) )
				return false;
		}
		// Todas as verificações foram feitas. Retornamos 'true'
		return true;
	}	
	//
	// Observação: Se você gerar o método construtor e os métodos gets/sets com o 
	// Eclipse, não deixe de fazer as seguintes alterações:
	// (1) Acrescente o "this." nos métodos get na linha onde tem o return.
	// (2) No construtor, troque as atribuições pelo uso dos métodos 'set'
	// (3) Nos métodos 'set' só faça a atribuição após testar o parâmetro
	//     usando o método 'validar' adequado.		
}