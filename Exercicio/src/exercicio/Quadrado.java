/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author pedro
 */
public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);

    }

    @Override

    public String toString() {
        return "Quadrado" + "\n" + "lado1: " + this.getLado1() + "\n" + "lado2: " + this.getLado2();
    }

}
