package classes;

public class Aluno {
	private String nome;
	private double nota1, nota2;
	private double mediaPonderada = 0;
	
	public Aluno(){
	}
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.mediaPonderada = (this.nota1*2+this.nota2*3)/5;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getMediaPonderada() {
		return mediaPonderada;
	}

	public void setMediaPonderada(double mediaPonderada) {
		this.mediaPonderada = mediaPonderada;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [nome=");
		builder.append(nome);
		builder.append(", nota1=");
		builder.append(String.format("%.2f",nota1));
		builder.append(", nota2=");
		builder.append(String.format("%.2f",nota2));
		builder.append(", media ponderada=");
		builder.append(String.format("%.2f",mediaPonderada));
		builder.append("]");
		return builder.toString();
	}
}
