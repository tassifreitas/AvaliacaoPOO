package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import db.Conexao;
import modules.Aluno;
import modules.Emprestimo;
import modules.Item;
import modules.Professor;

public class Dao {
	
	private Connection connection;

	public Dao() {
		connection = Conexao.getConnetion();
	}
	
	//operações para cadastro de aluno
	public void salvarAluno(Aluno aluno) {
		try {
			String sql = "INSERT INTO aluno(matricula,curso,nomeUsuario,login,senha) VALUES (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, aluno.getMatricula());	
			statement.setString(2, aluno.getCurso());
			statement.setString(3, aluno.getNomeUsuario());
			statement.setString(4, aluno.getLogin());
			statement.setString(5, aluno.getSenha());

			statement.execute();
			connection.commit();// Executa no banco

		} catch (Exception e) {
			try {
				connection.rollback();// Reverte a operação
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public List<Aluno> listarAluno() throws Exception {

		List<Aluno> list = new ArrayList<Aluno>();

		String sql = "SELECT * FROM aluno";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			Aluno aluno = new Aluno();
			aluno.setMatricula(resultado.getString("matricula"));
			aluno.setCurso(resultado.getString("curso"));
			aluno.setNomeUsuario(resultado.getString("nomeusuario"));
			aluno.setLogin(resultado.getString("login"));
			aluno.setSenha(resultado.getString("senha"));

			list.add(aluno);

		}

		return list;
	}

	public Aluno buscarAluno(String matricula) throws Exception {
		Aluno aluno = new Aluno();

		String sql = "SELECT * FROM aluno WHERE matricula = '"+matricula+"'";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			aluno.setMatricula(resultado.getString("matricula"));
			aluno.setCurso(resultado.getString("curso"));
			aluno.setNomeUsuario(resultado.getString("nomeusuario"));
			aluno.setLogin(resultado.getString("login"));
			aluno.setSenha(resultado.getString("senha"));

		}

		return aluno;
	}

	public void atualizarAluno(Aluno aluno) {

		try {
			String sql = "UPDATE aluno SET nomeusuario = ? WHERE matricula = '" + aluno.getMatricula()+"'";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, aluno.getNomeUsuario());
			statement.execute();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void deletarAluno(Aluno aluno) {
		try {
			String sql = "DELETE FROM aluno WHERE matricula = '" + aluno.getMatricula()+"'";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}	
	}
	
	//operações para cadastro de professores
	public void salvarProfessor(Professor professor) {
		try {
			String sql = "INSERT INTO professor(cod_professor,setor,nomeUsuario,login,senha) VALUES (?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, professor.getCodProfessor());	
			statement.setString(2, professor.getSetor());
			statement.setString(3, professor.getNomeUsuario());
			statement.setString(4, professor.getLogin());
			statement.setString(5, professor.getSenha());

			statement.execute();
			connection.commit();// Executa no banco

		} catch (Exception e) {
			try {
				connection.rollback();// Reverte a operação
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public List<Professor> listarProfessor() throws Exception {

		List<Professor> list = new ArrayList<Professor>();

		String sql = "SELECT * FROM professor";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			Professor professor = new Professor();
			professor.setCodProfessor(resultado.getString("cod_professor"));
			professor.setSetor(resultado.getString("setor"));
			professor.setNomeUsuario(resultado.getString("nomeusuario"));
			professor.setLogin(resultado.getString("login"));
			professor.setSenha(resultado.getString("senha"));

			list.add(professor);

		}

		return list;
	}

	public Professor buscarProfessor(String codProfessor) throws Exception {
		Professor professor = new Professor();

		String sql = "SELECT * FROM professor WHERE cod_professor = '"+codProfessor+"'";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			professor.setCodProfessor(resultado.getString("cod_Professor"));
			professor.setSetor(resultado.getString("setor"));
			professor.setNomeUsuario(resultado.getString("nomeusuario"));
			professor.setLogin(resultado.getString("login"));
			professor.setSenha(resultado.getString("senha"));

		}

		return professor;
	}

	public void atualizarProfessor(Professor professor) {

		try {
			String sql = "UPDATE professor SET nomeusuario = ? WHERE cod_professor = '" + professor.getCodProfessor()+"'";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, professor.getNomeUsuario());
			statement.execute();
			connection.commit();
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	public void deletarProfessor(Professor professor) {
		try {
			String sql = "DELETE FROM professor WHERE cod_professor = '" + professor.getCodProfessor()+"'";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.execute();
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}	
	}
	
	//emprestimo
	public void salvarEmprestimo(Item item) {
		try {
			String sql = "INSERT INTO item(id, nome, autor, tipo, ano, tempoReserva, codUsuario) VALUES (?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, item.getId());	
			statement.setString(2, item.getNome());
			statement.setString(3, item.getAutor());
			statement.setString(4, item.getTipo());
			statement.setString(5, item.getAno());
			statement.setString(6, item.getTempoReserva());
			statement.setString(7, item.getCodUsuario());
		
			statement.execute();
			connection.commit();// Executa no banco

		} catch (Exception e) {
			try {
				connection.rollback();// Reverte a operação
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public List<Emprestimo> listarEmprestimosAluno(String codUsuario) throws Exception {

		List<Emprestimo> list = new ArrayList<Emprestimo>();
		
		String sql = " SELECT nome, autor, tipo, tempoReserva, aluno.nomeusuario FROM item";
		sql+=" INNER JOIN aluno AS aluno ";
		sql+=" ON item.codusuario = aluno.matricula ";
		sql+=" WHERE aluno.matricula = '" + codUsuario +"'";
		
		
		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();
		
		while (resultado.next()) {
			Emprestimo emprestimo = new Emprestimo();
			emprestimo.setNome(resultado.getString("nome"));
			emprestimo.setAutor(resultado.getString("autor"));
			emprestimo.setTipo(resultado.getString("tipo"));
			emprestimo.setTempoReserva(resultado.getString("tempoReserva"));
			emprestimo.setMatricula(resultado.getString("nomeusuario"));
			
			list.add(emprestimo);
		}

		return list;
	}
	
	public List<Emprestimo> listarEmprestimosProfessor(String codUsuario) throws Exception {

		List<Emprestimo> list = new ArrayList<Emprestimo>();
		
		String sql = " SELECT item.nome, item.autor, item.tipo, item.tempoReserva, professor.nomeusuario FROM item";
		sql+=" INNER JOIN professor AS professor ";
		sql+=" ON item.codusuario = professor.cod_professor ";
		sql+=" WHERE professor.cod_professor = '" + codUsuario +"'";
		
		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet resultado = statement.executeQuery();

		while (resultado.next()) {
			Emprestimo emprestimo = new Emprestimo();
			emprestimo.setNome(resultado.getString("nome"));
			emprestimo.setAutor(resultado.getString("autor"));
			emprestimo.setTipo(resultado.getString("tipo"));
			emprestimo.setTempoReserva(resultado.getString("tempoReserva"));
			emprestimo.setMatricula(resultado.getString("nomeusuario"));

			list.add(emprestimo);
		}

		return list;
	}

}
