package dominio;

import java.util.Calendar;

public class FrequenciaCardiaca{
	private String nome, sobrenome;
	private int dia, mes, ano;
	
	public FrequenciaCardiaca(String nome, String sobrenome, int dia, int mes, int ano) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {

		return ano;
	}

	public void setAno(int ano) {

		this.ano = ano;
	}
	
	
	
	public String informarNome() {

		return nome + " " + sobrenome;
	}

	public String informarNascimento(){
		return dia + "/" + mes + "/" + ano;

	}

	public int calcularIdade(){
		Calendar cal = Calendar.getInstance();

		int anoA = cal.get(Calendar.YEAR);
		int diaA = cal.get(Calendar.DAY_OF_MONTH) + 1;
		int mesA = cal.get(Calendar.MONTH);

		int idade = anoA - ano;

		if(mesA < mes || (mesA == mes && diaA < dia))
			idade--;
		


		return idade;
	}

	public int calcularFcm(){
		return 220 - this.calcularIdade();
	}

	public float calcularFca(){
		return calcularFcm() * (float)0.85 - calcularFcm() * (float) 0.5;
	}
}



