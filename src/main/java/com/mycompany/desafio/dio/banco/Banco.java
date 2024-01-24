/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio.dio.banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andreleite
 */
public class Banco {

    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void listaClientes() {
    System.out.println("Lista de Clientes do Banco " + nome + ":");
    if (clientes != null && !clientes.isEmpty()) {
        for (Cliente cliente : clientes) {
            System.out.println(String.format("Titular: %s", cliente.getNome()));
        }
    } else {
        System.out.println("A lista de clientes está vazia.");
    }
}

}