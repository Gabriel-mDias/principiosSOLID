/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.interfaceSegregation;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class DescontoTipo implements Desconto{

    @Override
    public double calcularDesconto(Produto p) {
        return p.getValorUnitario() * p.getTipoProduto().getDesconto();
    }

    public String tipoDesconto(Produto p){
        return p.getTipoProduto().getTipo();
    }
    
}
