package executavel;

import javax.swing.JOptionPane;

import modules.Aluno;
import modules.Biblioteca;
import modules.Item;
import modules.Professor;

public class Principal {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
		String mat;
		String codProf;
		while(true) {
		Integer op = Integer.parseInt(JOptionPane.showInputDialog("Informe o que você deseja fazer: \n"
				+ "1 - Cadastrar Aluno\n"
				+ "2 - Listar Alunos cadastrados\n"
				+ "3 - Buscar Aluno\n"
				+ "4 - Atualizar Aluno\n"
				+ "5 - Deletar Aluno\n"
				+ "6 - Cadastrar Professor\n"
				+ "7 - Listar Professores cadastrados\n"
				+ "8 - Buscar Professor\n"
				+ "9 - Atualizar Professor\n"
				+ "10 - Deletar Professor\n"
				+ "11 - Cadastrar item emprestado\n"
				+ "12 - Lista de emprestimos\n"
				//+ "13 - Deletar item emprestado\n"
		));
		switch (op) {
		case 1:
			String matricula = JOptionPane.showInputDialog("Informe a matrícula do aluno: ");
			String curso = JOptionPane.showInputDialog("Informe o curso do aluno: ");
			String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
			String login = JOptionPane.showInputDialog("Informe o login do aluno: ");
			String senha = JOptionPane.showInputDialog("Informe o senha do aluno: ");
			
			Aluno aluno = new Aluno(matricula, curso, nomeAluno, login, senha);
			
			biblioteca.cadastrarAluno(aluno);
			break;
		case 2:
			biblioteca.listaAluno();
			break;
		case 3:
			mat = JOptionPane.showInputDialog("Informe a matrícula do aluno que vc quer buscar:");
			biblioteca.buscaAluno(mat);
			break;
		case 4:
			mat = JOptionPane.showInputDialog("Informe a matrícula do aluno que vc quer atualizar:");
			biblioteca.atualizaAluno(mat);
			break;
		case 5:
			mat = JOptionPane.showInputDialog("Informe a matrícula do aluno que vc quer deletar:");
			biblioteca.deletaAluno(mat);
			break;
		case 6:
			String codProfessor = JOptionPane.showInputDialog("Informe o código do professor: ");
			String setor = JOptionPane.showInputDialog("Informe o setor o qual o professor está vinculado: ");
			String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor: ");
			String loginProfessor = JOptionPane.showInputDialog("Informe o login do professor: ");
			String senhaProfessor = JOptionPane.showInputDialog("Informe o senha do professor: ");
			
			Professor professor = new Professor(codProfessor, setor, nomeProfessor, loginProfessor, senhaProfessor);
			
			biblioteca.cadastrarProfessor(professor);
			break;
		case 7:
			biblioteca.listaProfessor();
			break;
		case 8:
			codProf = JOptionPane.showInputDialog("Informe o código do professor que vc quer buscar:");
			biblioteca.buscaProfessor(codProf);
			break;
		case 9:
			codProf = JOptionPane.showInputDialog("Informe o código do professor que vc quer atualizar:");
			biblioteca.atualizaProfessor(codProf);
			break;
		case 10:
			codProf = JOptionPane.showInputDialog("Informe o código do professor que vc quer deletar:");
			biblioteca.deletaProfessor(codProf);
			break;
			
		case 11:
			String id = JOptionPane.showInputDialog("Informe o codigo do item: ");
			String nome = JOptionPane.showInputDialog("Informe o nome do item: ");
			String autor = JOptionPane.showInputDialog("Informe o autor do item: ");
			String ano = JOptionPane.showInputDialog("Informe o ano de publicação do item: ");
			String tipo = JOptionPane.showInputDialog("Informe o tipo do item (livro, periódico, artigo, revista, monografia): ");
			String periodo = JOptionPane.showInputDialog("Informe o período da reserva (em dias): ");
			String codUsuario = JOptionPane.showInputDialog("Informe a matricula ou codigo do professor: ");
			
			Item item = new Item(id, nome, autor, tipo, ano, periodo, codUsuario);
			
			biblioteca.cadastrarEmprestimo(item);
			break;
		case 12:
			String codUser = JOptionPane.showInputDialog("Informe o código do usuário que você quer listar os empréstimos:");
			biblioteca.listaEmprestimos(codUser);
			break;
		default:
			break;
		}
	}
	}
}
