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
public class NotaFiscal {
    private String texto;
    
    
    public String gerarNota(CarrinhoSPC c, double total){
        texto = "";
        texto += "Produtos: \n";
        for(Produto p : c.getProdutos()){
            texto += p.getNome()+", ";
        }
        texto+="\nValor total: R$ "+total;
        
        return texto;
    }
}
