package modules;

public class Professor extends Usuario {
	
	protected String codProfessor;
	protected String setor;
	
	public Professor() {
		super();
	}
	
	public Professor(String codProfessor, String setor, String nomeUsuario, String login, String senha) {
		super(nomeUsuario,login, senha);
		this.codProfessor = codProfessor;
		this.setor = setor;
	}

	public String getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public String toString() {
		return "Professor [nome =" + nomeUsuario + " codProfessor=" + codProfessor + ", setor=" + setor + "]";
	}

}
