/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

/**
 *
 * @author pedro
 */
public class Prova4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Aluno1 aluno1 = new Aluno1("João", "202011020010");
        aluno1.adicionarNota(8.0);
        aluno1.adicionarNota(7.5);

        Aluno1 aluno2 = new Aluno1("Maria", "202011020011");
        aluno2.adicionarNota(6.0);
        aluno2.adicionarNota(5.5);

        Aluno1 aluno3 = new Aluno1("Pedro", "202011020012");
        aluno3.adicionarNota(9.0);
        aluno3.adicionarNota(8.5);

        Aluno disciplina = new Aluno("Matematica");

        disciplina.adicionarAluno(aluno1);
        disciplina.adicionarAluno(aluno2);
        disciplina.adicionarAluno(aluno3);

        disciplina.listarAlunos();

        disciplina.removerAluno("Maria");

        disciplina.listarAlunos();
    }

}
