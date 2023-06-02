/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author pedro
 */
public abstract class Figura {

    private String cor;

    public Figura(String cor) {
        this.cor = cor;
    }

    public String setCor(String cor) {
        this.cor = cor;
        return null;
    }

    public String getCor() {
        return cor;
    }

    
    public abstract double area();

}
