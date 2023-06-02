/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author pedro
 */
public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio, String cor) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo" + "\n" + "raio: " + this.raio;
    }

    @Override
    public double area() {
        return (raio * raio) * 3.14;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

}
