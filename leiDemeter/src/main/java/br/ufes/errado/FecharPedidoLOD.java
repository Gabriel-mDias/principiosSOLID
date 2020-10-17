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
public class FecharPedidoLOD {
    
    private double valorTotal;
    private CarrinhoLOD carrinho;

    public FecharPedidoLOD(CarrinhoLOD carrinho) {
        this.carrinho = carrinho;
    }
    
        //Interagindo com métodos pertecentes a objetos do carrinho e que nada deveriam ter a ver com o fecharPedido
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
