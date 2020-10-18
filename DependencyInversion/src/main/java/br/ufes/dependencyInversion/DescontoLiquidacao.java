/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.dependencyInversion;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class DescontoLiquidacao implements Desconto{

    @Override
    public double calcularDesconto(Produto p) {
        return p.getEstoque().getQuantidade() > 100 ? p.getValorUnitario() * 0.1 : 0;
    }
    
}
