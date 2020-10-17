/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

import br.ufes.models.Produto;
import br.ufes.models.TipoProduto;

/**
 *
 * @author gabriel
 */
public class ProdutoEscolar extends Produto{
    
    public ProdutoEscolar(String nome, double valorUnitario, double quantidade, TipoProduto tipo) {
        super(nome, valorUnitario, quantidade, tipo);
    }
    
        //Mudando o comportamento da função herdada
    @Override
    public boolean estoqueDisponivel(double quantidade){
        if(super.getEstoque().getQuantidade() > 0)
            return true;
        return false;
    }
}
