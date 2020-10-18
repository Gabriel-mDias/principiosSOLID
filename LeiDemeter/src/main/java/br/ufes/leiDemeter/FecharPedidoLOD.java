/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leiDemeter;

/**
 *
 * @author gabriel
 */
public class FecharPedidoLOD {
    
    private double valorTotal;
    private CarrinhoLOD carrinho;

    public FecharPedidoLOD(CarrinhoLOD carrinho) {
        this.carrinho = carrinho;
        this.valorTotal = this.carrinho.getValorCarrinho();
    }
    

    public double getValorTotal() {
        return this.valorTotal;
    }
    
    public void fecharCompra(){
        this.getValorTotal();
    }
}
