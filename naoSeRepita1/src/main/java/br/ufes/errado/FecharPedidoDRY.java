/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

import br.ufes.models.Produto;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class FecharPedidoDRY {
    
    private double valorTotal;
    private CarrinhoDRY carrinho;
    private List<Produto> produtos;

    public FecharPedidoDRY(CarrinhoDRY carrinho) {
        this.carrinho = carrinho;
        this.produtos = this.carrinho.getProdutos();
    }
    

    public double getValorTotal() {
        return this.valorTotal = this.carrinho.getValorCarrinho();
    }
    
    public void fecharCompra(){
        this.getValorTotal();
    }
    
    public void removerProduto(Produto p){
        this.produtos.remove(p);
    }
}
