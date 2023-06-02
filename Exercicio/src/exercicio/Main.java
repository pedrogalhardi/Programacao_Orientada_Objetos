/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5, 5, "azul");
        Retangulo retangulo = new Retangulo(10, 5, "verde");
        Triangulo triangulo = new Triangulo(6, 6, "amarelo");
        Circulo circulo = new Circulo(5, "branco");
        
        System.out.println(quadrado.toString() + "\n" + "Resultado: " + quadrado.area() +"\n" );
        System.out.println(retangulo.toString() + "\n"+ "Resultado: " + retangulo.area()+"\n");
        System.out.println(triangulo.toString() + "\n"+ "Resultado: " + triangulo.area()+"\n");
        System.out.println(circulo.toString() + "\n" + "Resultado: "+ circulo.area()+"\n");
        

    }
}
