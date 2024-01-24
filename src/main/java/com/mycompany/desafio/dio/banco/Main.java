/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.dio.banco;


/**
 *
 * @author andreleite
 */
public class Main {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("Banco XYZ");

        Cliente Andre = new Cliente();
        Andre.setNome("Andre");
        Cliente teste = new Cliente();
        teste.setNome("teste");
        Cliente Duda = new Cliente();
        Duda.setNome("Duda");
        Cliente pai = new Cliente();
        pai.setNome("pai");

        Conta ccp = new ContaCorrente(pai, meuBanco);
        Conta cca = new ContaCorrente(Andre, meuBanco);
        Conta ccd = new ContaCorrente(Duda, meuBanco);
        Conta cct = new ContaCorrente(teste, meuBanco);

        ccp.imprimirExtrato();
        cca.imprimirExtrato();
        ccd.imprimirExtrato();
        cct.imprimirExtrato();

        meuBanco.listaClientes(); // Corrigido para usar o método no objeto Banco
    }
}

