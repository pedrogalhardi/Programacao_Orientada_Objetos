/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author pedro
 */
public class Caminhao extends Veiculo {

    private int eixos;

    public Caminhao(int eixos, String placa, Integer ano) {
        super(placa, ano);
        this.eixos = eixos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Eixos: " + eixos + " " + "Ano: " + getAno() + " " + "Placa: " + getPlaca()+ "\n");
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

}
