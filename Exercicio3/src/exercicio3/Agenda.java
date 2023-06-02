/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Agenda {

    private ArrayList<Pessoa> Lista = new ArrayList();

    public void armazenaPessoa(Pessoa pessoa) {
        if (pessoa != null && !Lista.contains(pessoa)) {
            Lista.add(pessoa);
        }
    }

    public void removePessoa(String nome) {

        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNome().equals(nome)) {
                Lista.remove(i);
                System.out.println("Pessoa removida");
            }
        }

    }

    public int buscarPessoa(String nome) {

        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getNome().equals(nome)) {
            
                pos = i;
            }

        }
        return pos;

//        for (int i = 0; i < Lista.size(); i++) {
//            if (Lista.get(i).getNome().equals(nome)) {
//                return i;
//            }
//        }
//        return -1;
    }

    public void imprimeAgenda() {

        System.out.println(Lista);

    }

    public void imprimePessoa(int index) {
        if (index >= 0 && index < Lista.size()) {
            Pessoa pessoa = Lista.get(index);
            System.out.println("Nome: " + pessoa.getNome() + "...");
        } else {
            System.out.println("Posicao nao existe.");
        }

//        index = 0;
//        for (int i = 0; i < Lista.size(); i++) {
//            if (Lista.get(i).getNome().equals(index)) {
//                index = i;
//            }
//        }
//        System.out.println(index);
    }

}
