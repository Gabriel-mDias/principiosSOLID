/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

/**
 *
 * @author gabriel
 */
public class Funcionario {
    
    private String nome;
    private String endereco;
    private String codigo;
    private double salario;
    private double funcao;

    public Funcionario(String nome, String endereco, String codigo, double salario, double funcao) {
        this.nome = nome;
        this.endereco = endereco;
        this.codigo = codigo;
        this.salario = salario;
        this.funcao = funcao;
    }
}
