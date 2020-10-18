/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusoComposicao;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class FecharPedidoCRP {
    
    private double valorTotal;
    private CarrinhoCRP carrinho;

    public FecharPedidoCRP(CarrinhoCRP carrinho) {
        this.carrinho = carrinho;
    }
    

    public double getValorTotal() {
        this.valorTotal=0;
        for(Produto p: this.carrinho.getProdutos()){
            this.valorTotal+=p.getValorUnitario();
            for(Desconto d : this.carrinho.getDescontos()){
                this.valorTotal-=d.aplicarDesconto(p);
            }
        }
        return this.valorTotal;
    }
    
    public void fecharCompra(){
        this.getValorTotal();
    }
}
