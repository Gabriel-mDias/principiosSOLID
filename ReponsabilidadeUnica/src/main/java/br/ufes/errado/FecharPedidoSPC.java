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
public class FecharPedidoSPC {
    
    private double valorTotal;
    private CarrinhoSPC carrinho;
    private String nota;

    public FecharPedidoSPC(CarrinhoSPC carrinho) {
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
        this.gerarNota(carrinho, this.getValorTotal());
    }
    
    public String gerarNota(CarrinhoSPC c, double total){
        nota = "";
        nota += "Produtos: \n";
        for(Produto p : c.getProdutos()){
            nota += p.getNome()+", ";
        }
        nota+="\nValor total: R$ "+total;
        
        return nota;
    }
}
