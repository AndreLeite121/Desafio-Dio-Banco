/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafio.dio.banco;

/**
 *
 * @author andreleite
 */
public abstract class Conta implements IBanco {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    
    protected int Agencia;
    protected int Numero;
    protected double Saldo;
    protected Cliente cliente;
    protected Banco pessoas;
    
    public Conta(Cliente cliente, Banco banco){
        this.Agencia = Conta.AGENCIA_PADRAO;   
        this.Numero = SEQUENCIAL++;
        this.cliente = cliente;
        banco.getClientes().add(cliente);
    }
   
    @Override
    public void sacar(double valor) {
        Saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        Saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
  
    public int getAgencia() {
        return Agencia;
    }

    public int getNumero() {
        return Numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    protected void imprimirInfosComuns() {
        //System.out.println(String.format("Test: %s", this.);
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.Agencia));
        System.out.println(String.format("Número: %d", this.Numero));
        System.out.println(String.format("Saldo: %.2f", this.Saldo));
    }
    
    @Override
    public String getNomeCliente() {
        return cliente.getNome();
    }

    @Override
    public void listaClientes() {
    System.out.println("Lista de Clientes:");
        for (Cliente cliente : pessoas.getClientes()) {
            System.out.println(String.format("Titular: %s", cliente.getNome()));
        }
}
}
    
    

