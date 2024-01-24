/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.dio.banco;

/**
 *
 * @author andreleite
 */
public interface IBanco {
    public void sacar(double valor);
    public void depositar(double valor);
    public void transferir(double valor, Conta contaDestino);
    public void imprimirExtrato();
    public void listaClientes();
    String getNomeCliente();
}
