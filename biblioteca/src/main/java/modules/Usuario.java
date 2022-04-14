package modules;
//import java.util.ArrayList;
//import java.util.List;

public class Usuario {
	protected String nomeUsuario;
	protected String login;
	protected String senha;
	//protected List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
	public Usuario() {}
	
	public Usuario(String nomeUsuario, String login, String senha) {
		this.nomeUsuario = nomeUsuario;
		this.login = login;
		this.senha = senha;
		//this.emprestimos = emprestimos;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Usuario [nomeUsuario=" + nomeUsuario + ", login=" + login + ", senha=" + senha + "]";
	}

}
