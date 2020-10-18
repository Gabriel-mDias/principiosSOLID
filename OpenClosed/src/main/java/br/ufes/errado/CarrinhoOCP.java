/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

import br.ufes.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class CarrinhoOCP {
    private List<Produto> produtos;
    private List<Desconto> descontos;
    
    public CarrinhoOCP() {
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<Desconto> getDescontos() {
        return descontos;
    }
    
}
