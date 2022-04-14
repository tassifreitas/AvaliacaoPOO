package modules;

//import java.util.ArrayList;
//import java.util.List;

public class Item {
	protected String id;
	protected String nome;
	protected String autor;
	protected String tipo; //livro, periodico, midia, monografia
	protected String ano;
	protected String tempoReserva;
	protected String codUsuario;
	
	public Item() {
		
	}
	
	public Item(String id, String nome, String autor, String tipo, String ano, String tempoReserva, String codUsuario) {
		this.id = id;
		this.nome = nome;
		this.autor = autor;
		this.tipo = tipo;
		this.ano = ano;
		this.tempoReserva = tempoReserva;
		this.codUsuario = codUsuario;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getTempoReserva() {
		return tempoReserva;
	}
	public void setTempoReserva(String tempoReserva) {
		this.tempoReserva = tempoReserva;
	}

	public String getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(String codUsuario) {
		this.codUsuario = codUsuario;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", nome=" + nome + ", autor=" + autor + ", tipo=" + tipo + ", ano=" + ano
				+ ", tempoReserva=" + tempoReserva + ", codUsuario=" + codUsuario + "]";
	}

}
