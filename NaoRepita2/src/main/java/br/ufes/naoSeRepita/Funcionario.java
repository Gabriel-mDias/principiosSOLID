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
public class Funcionario extends Pessoa{
    
    
    private String funcao;

    public Funcionario(String nome, String endereco, String codigo, double salario, String funcao) {
        super(nome, endereco, codigo, salario);
        this.funcao = funcao;
    }

    
}
