/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Aluno {

    private String nome;
    private List<Aluno1> alunos;

    public Aluno(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno1 aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void removerAluno(String nome) {
        for (Aluno1 aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                alunos.remove(aluno);
                return;
            }
        }
    }

    public void listarAlunos() {
        List<Aluno1> aprovados = new ArrayList<>();
        List<Aluno1> reprovados = new ArrayList<>();

        for (Aluno1 aluno : alunos) {
            double media = aluno.calcularMedia();

            if (media >= 6.0) {
                aprovados.add(aluno);
            } else {
                reprovados.add(aluno);
            }
        }

        System.out.println("Alunos Aprovados:");
        for (Aluno1 aluno : aprovados) {
            System.out.println("Nome: " + aluno.getNome() + " - Média: " + aluno.calcularMedia());
        }

        System.out.println("\nAlunos Reprovados:");
        for (Aluno1 aluno : reprovados) {
            System.out.println("Nome: " + aluno.getNome() + " - Média: " + aluno.calcularMedia());
        }
    }
}
