/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Objects;

/**
 *
 * @author pedro
 */
public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Pessoa)) {
            return false;
        }

        Pessoa outra = (Pessoa) obj;
        return outra.getNome().equals(getNome()) && outra.getIdade() == getIdade() && outra.getAltura() == getAltura();
    }

    @Override
    public String toString() {
        return "Pessoa" + " " + "nome= " + nome + ", idade= " + idade + " altura= " + altura + "\n";
    }

}
