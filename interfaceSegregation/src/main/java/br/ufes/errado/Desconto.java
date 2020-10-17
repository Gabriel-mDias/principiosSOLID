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
public interface Desconto {
    
    public double calcularDesconto(Produto p);
    
        //Esse método serve para os descontos do tipoProduto, retornando qual o desconto para aquele tipo de produto
    public String tipoDesconto(Produto p);
    
}
