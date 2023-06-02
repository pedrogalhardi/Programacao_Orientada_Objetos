/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio3;

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        agenda.armazenaPessoa(null);

        Pessoa p1 = new Pessoa("Matheus", 17, 175);
        Pessoa p2 = new Pessoa("Pedro", 21, 186);
        Pessoa p3 = new Pessoa("Lucas", 27, 181);
        Pessoa p4 = new Pessoa("Marcos", 27, 181);

        agenda.armazenaPessoa(p1);
        agenda.armazenaPessoa(p2);
        agenda.armazenaPessoa(p3);
        agenda.armazenaPessoa(p4);

        agenda.imprimeAgenda();
        System.out.println("Pessoa estava na posicao " + agenda.buscarPessoa("Marcos"));

        agenda.removePessoa("Lucas");

        //agenda.imprimePessoa(3);
        agenda.imprimeAgenda();
    }

}
