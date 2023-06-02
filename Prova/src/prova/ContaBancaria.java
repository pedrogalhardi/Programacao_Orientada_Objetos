/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author pedro
 */
public class ContaBancaria {

    private String nomeTitular;
    private double saldo;

    public ContaBancaria(String nomeTitular, double saldoInicial) {
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
}
