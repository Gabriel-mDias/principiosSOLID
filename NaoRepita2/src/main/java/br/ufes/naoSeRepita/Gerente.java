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
public class Gerente extends Pessoa{
    
    private String departamento;

    public Gerente(String nome, String endereco, String codigo, double salario, String departamento) {
        super(nome, endereco, codigo, salario);
        this.departamento = departamento;
    }

}
