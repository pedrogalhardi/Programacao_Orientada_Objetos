/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author pedro
 */
public class Veiculo {

    private String modelo;
    private int ano;
    private String marca;
    private int velocidadeMaxima;
    private int velocidadeAtual;

    public Veiculo(String modelo, int ano, String marca, int velocidadeMaxima) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int velocidade) {
        if (this.velocidadeAtual + velocidade <= this.velocidadeMaxima) {
            this.velocidadeAtual += velocidade;
        } else {
            this.velocidadeAtual = this.velocidadeMaxima;
        }
    }

    public void frear(double valor) {
        if (valor >= 0.1 && valor <= 1.0) {
            this.velocidadeAtual -= (int) (this.velocidadeAtual * valor);
        }
    }

    public String informacoes() {
        return "Modelo: " + this.modelo + "\nAno: " + this.ano + "\nMarca: " + this.marca + "\nVelocidade atual: " + this.velocidadeAtual;
    }
}
