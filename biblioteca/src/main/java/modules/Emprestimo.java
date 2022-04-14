package modules;

public class Emprestimo {
	protected String nome;
	protected String autor;
	protected String tipo;
	protected String tempoReserva;
	protected String matricula;
	
	public Emprestimo() {
	}

	public Emprestimo(String nome, String autor, String tipo, String tempoReserva, String matricula) {
		super();
		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;
		this.tempoReserva = tempoReserva;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTempoReserva() {
		return tempoReserva;
	}

	public void setTempoReserva(String tempoReserva) {
		this.tempoReserva = tempoReserva;
	}

	public String getmatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Emprestimo [nome=" + nome + ", autor=" + autor + ", tipo=" + tipo + ", tempoReserva=" + tempoReserva
				+ ", nomeUsuario =" + matricula + "]";
	}
	
}
