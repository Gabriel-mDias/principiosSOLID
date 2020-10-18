/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoSeRepita;

/**
 *
 * @author gabriel
 */
public class Pessoa {
    
    private String nome;
    private String endereco;
    private String codigo;
    private double salario;

    public Pessoa(String nome, String endereco, String codigo, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
        this.salario = salario;
    }
}
