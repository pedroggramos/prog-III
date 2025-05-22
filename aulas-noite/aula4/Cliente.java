package dominio;

public class Cliente {
	private String nome, cpf, data;

	public Cliente(String nome, String cpf, String data) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	public String formatarData() {
		return data.substring(0,2) + "/" + data.substring(2,4) + "/" + data.substring(4,8);
	}
	public String formatarCPF() {
		return cpf.substring(0,3) + "." + cpf.substring(3,6) + "." + cpf.substring(6,9) + "-" + cpf.substring(9,11);
	}
}
