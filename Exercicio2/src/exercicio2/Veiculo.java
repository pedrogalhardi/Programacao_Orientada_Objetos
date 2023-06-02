/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author pedro
 */
public class Veiculo {

    private String placa;
    private Integer ano;

    public Veiculo(String placa, Integer ano) {
        this.placa = placa;
        this.ano = ano;
    }
    
    public void exibirDados(){
        System.out.println(ano + placa);
    }
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

}
