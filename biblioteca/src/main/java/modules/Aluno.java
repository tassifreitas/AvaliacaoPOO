package modules;

public class Aluno extends Usuario {
	
	String matricula;
	String curso;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String matricula, String curso, String nomeUsuario, String login, String senha) {
		super(nomeUsuario,login, senha);
		this.matricula = matricula;
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Aluno [nome =" + nomeUsuario + " matricula=" + matricula + ", curso=" + curso + "]";
	}

	
	
	
	

}
