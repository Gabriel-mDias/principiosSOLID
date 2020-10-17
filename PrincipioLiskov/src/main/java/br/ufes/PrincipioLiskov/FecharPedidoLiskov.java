/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.PrincipioLiskov;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class FecharPedidoLiskov {
    
    private double valorTotal;
    private CarrinhoLiskov carrinho;

    public FecharPedidoLiskov(CarrinhoLiskov carrinho) {
        this.carrinho = carrinho;
    }
    

    public double getValorTotal() {
        valorTotal=0;
        for(Produto p: this.carrinho.getProdutos()){
            valorTotal+=p.getValorUnitario();
        }
        return valorTotal;
    }
    
    public void fecharCompra(){
        this.getValorTotal();
    }
}
