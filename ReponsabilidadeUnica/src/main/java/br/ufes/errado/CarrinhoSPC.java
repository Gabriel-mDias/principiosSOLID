/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.errado;

import br.ufes.responsabilidadeUnica.*;
import br.ufes.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class CarrinhoSPC {
    
    private List<Produto> produtos;

    public CarrinhoSPC() {
        produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void addProdutos(Produto p){
        produtos.add(p);
    }
    
}
