/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoSeRepita;

import br.ufes.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class CarrinhoDRY {
    private List<Produto> produtos;
    
    public CarrinhoDRY() {
        produtos = new ArrayList<>();
    }
    
    public void addProdutos(Produto p){
        produtos.add(p);
    }
    
    public void retirarProduto(Produto p){
        this.produtos.remove(p);
    }
    
    public double getValorCarrinho(){
        double valorCarrinho = 0;
        for(Produto p: this.getProdutos()){
            valorCarrinho+=p.getValorUnitario();
        }
        return valorCarrinho;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
}
