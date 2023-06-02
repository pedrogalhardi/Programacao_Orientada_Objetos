/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prova;

/**
 *
 * @author pedro
 */
public class Prova2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Pedro Henrique Galhardi ", 1000.00);

        System.out.println("Saldo atual: " + minhaConta.consultarSaldo());

        minhaConta.depositar(500.00);

        System.out.println("Saldo dpos do deposito: " + minhaConta.consultarSaldo());

        minhaConta.sacar(200.00);

        System.out.println("Saldo depois do saque: " + minhaConta.consultarSaldo());
    }
}
