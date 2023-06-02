/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Veiculo[] veiculo = new Veiculo[6];

        veiculo[0] = new Caminhao(8, "HZX-2879", 2010);
        veiculo[1] = new Caminhao(6, "TYB-4779", 2012);
        veiculo[2] = new Caminhao(10, "EWS-8979", 2014);
        veiculo[3] = new Onibus(35, "NOO-2857", 2016);
        veiculo[4] = new Onibus(65, "PLK-2049", 2018);
        veiculo[5] = new Onibus(50, "BNG-2739", 2020);

        System.out.println("Dados dos veiculos");
        for (int i = 0; i < 6; i++) {
            veiculo[i].exibirDados();
        }

    }

}
