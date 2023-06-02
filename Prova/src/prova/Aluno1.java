/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Aluno1 {

    private String nome;
    private String matricula;
    private String curso;
    private ArrayList<Aluno1> notas;

    public Aluno1(String nome, String matricula, String curso, ArrayList<Aluno1> notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.notas = notas;
    }

    Aluno1(String pedro, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public float media() {

        int nota1 = 10;
        int nota2 = 30;
        int nota3 = 20;

        float media = nota1 + nota2 + nota3;

        return media;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public ArrayList<Aluno1> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Aluno1> notas) {
        this.notas = notas;
    }

    double calcularMedia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void adicionarNota(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
