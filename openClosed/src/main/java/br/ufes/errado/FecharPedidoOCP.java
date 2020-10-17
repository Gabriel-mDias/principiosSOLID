/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class FecharPedidoOCP {
    
    private double valorTotal;
    private CarrinhoOCP carrinho;

    public FecharPedidoOCP(CarrinhoOCP carrinho) {
        this.carrinho = carrinho;
    }
    

    public double getValorTotal() {
        this.valorTotal=0;
        for(Produto p: this.carrinho.getProdutos()){
            this.valorTotal+=p.getValorUnitario();
            for(Desconto d : this.carrinho.getDescontos()){
                this.valorTotal-=d.calcularDesconto(p);
            }
        }
        return this.valorTotal;
    }
    
    public void fecharCompra(){
        this.getValorTotal();
    }
}
