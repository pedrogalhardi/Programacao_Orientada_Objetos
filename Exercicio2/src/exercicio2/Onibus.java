/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author pedro
 */
public class Onibus extends Veiculo {

    private Integer assentos;

    public Onibus(Integer assentos, String placa, Integer ano) {
        super(placa, ano);
        this.assentos = assentos;
    }

    @Override
    public void exibirDados() {
        System.out.println("Assentos: " + assentos + " " + "Ano: " + getAno() + " " + "Placa: " + getPlaca() + "\n");
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

}
