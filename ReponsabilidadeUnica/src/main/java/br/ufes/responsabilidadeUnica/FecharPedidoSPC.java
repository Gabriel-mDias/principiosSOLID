/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.responsabilidadeUnica;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class FecharPedidoSPC {
    
    private double valorTotal;
    private CarrinhoSPC carrinho;
    private NotaFiscal nota;

    public FecharPedidoSPC(CarrinhoSPC carrinho) {
        this.carrinho = carrinho;
        this.nota=new NotaFiscal();
    }
    

    public double getValorTotal() {
        valorTotal=0;
        for(Produto p: this.carrinho.getProdutos()){
            valorTotal+=p.getValorUnitario();
        }
        return valorTotal;
    }
    
    public void fecharCompra(){
        this.nota.gerarNota(carrinho, this.getValorTotal());
    }
}
