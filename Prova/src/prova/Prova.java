/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

/**
 *
 * @author pedro
 */
public class Prova {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Fiesta", 2012, "Ford", 110);
        System.out.println("Informacoes do carro:");
        System.out.println(carro.informacoes());
        System.out.println("Acelerando em 50 km/h.");
        carro.acelerar(50);
    }
}
