/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leiDemeter;

import br.ufes.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class CarrinhoLOD {
    private List<Produto> produtos;
    private List<Desconto> descontos;
    
    public CarrinhoLOD() {
        produtos = new ArrayList<>();
        descontos = new ArrayList<>();
    }
    
    public void addProdutos(Produto p){
        produtos.add(p);
    }
    
    public void addDesconto(Desconto d){
        if(this.descontos.contains(d))
            throw new RuntimeException("Desconto já inserido!\n");
        this.descontos.add(d);
    }
    
    public double getValorCarrinho(){
        double valorCarrinho = 0;
        for(Produto p: this.getProdutos()){
            valorCarrinho+=p.getValorUnitario();
            for(Desconto d : this.getDescontos()){
                valorCarrinho-=d.calcularDesconto(p);
            }
        }
        return valorCarrinho;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Desconto> getDescontos() {
        return descontos;
    }
    
    
}
