/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author pedro
 */
public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura, String cor) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo" + "\n" + "base: " + this.base + "\n" + "altura: " + this.altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
