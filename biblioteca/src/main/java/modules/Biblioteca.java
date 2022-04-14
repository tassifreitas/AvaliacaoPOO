package modules;

import java.util.List;

import dao.Dao;
public class Biblioteca {
	
	public void cadastrarAluno(Aluno aluno){
		Dao dao = new Dao();
		dao.salvarAluno(aluno);
	}
	
	public static void listaAluno(){
		try {
			Dao dao = new Dao();
			List<Aluno> list = dao.listarAluno();
			dao.listarAluno();
			for(Aluno aluno : list) {
				System.out.println(aluno.toString());
				System.out.println("----------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void buscaAluno(String matricula) {
		try {
			Dao dao = new Dao();
			Aluno aluno = dao.buscarAluno(matricula);
			
			System.out.println(aluno.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void atualizaAluno(String matricula) {
		
		try {
			Dao dao = new Dao();
			Aluno aluno = dao.buscarAluno(matricula);
			
			aluno.setNomeUsuario("TestandoAmanha");
			
			dao.atualizarAluno(aluno);
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	public static void deletaAluno(String matricula) {
		try {
			Dao dao = new Dao();
			Aluno aluno = dao.buscarAluno(matricula);
			dao.deletarAluno(aluno);
					
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void cadastrarProfessor(Professor professor){
		Dao dao = new Dao();
		dao.salvarProfessor(professor);
	}
	
	public static void listaProfessor(){
		try {
			Dao dao = new Dao();
			List<Professor> list = dao.listarProfessor();
			dao.listarProfessor();
			for(Professor professor : list) {
				System.out.println(professor.toString());
				System.out.println("----------------");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void buscaProfessor(String codProfessor) {
		try {
			Dao dao = new Dao();
			Professor professor = dao.buscarProfessor(codProfessor);
			
			System.out.println(professor.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void atualizaProfessor(String codProfessor) {
		
		try {
			Dao dao = new Dao();
			Professor professor = dao.buscarProfessor(codProfessor);
			
			professor.setNomeUsuario("TestandoAmanha");
			
			dao.atualizarProfessor(professor);
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
	}
	
	public static void deletaProfessor(String codProfessor) {
		try {
			Dao dao = new Dao();
			Professor professor = dao.buscarProfessor(codProfessor);
			dao.deletarProfessor(professor);
					
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void cadastrarEmprestimo(Item item){
		Dao dao = new Dao();
		dao.salvarEmprestimo(item);
	}
	
	public static void listaEmprestimos(String codUsuario){
		try {
			Dao dao = new Dao();
			Professor professor = dao.buscarProfessor(codUsuario);
			Aluno aluno = dao.buscarAluno(codUsuario);
			if(codUsuario. equals(aluno.getMatricula())){
				List<Emprestimo> list = dao.listarEmprestimosAluno(codUsuario);
				dao.listarEmprestimosAluno(codUsuario);
				for(Emprestimo emprestimo : list) {
					System.out.println(emprestimo.toString());
					System.out.println("----------------");
				}
			}else {
				if(codUsuario. equals(professor.getCodProfessor())){
					List<Emprestimo> list = dao.listarEmprestimosProfessor(codUsuario);
					dao.listarEmprestimosProfessor(codUsuario);
					for(Emprestimo emprestimo : list) {
						System.out.println(emprestimo.toString());
						System.out.println("----------------");
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
