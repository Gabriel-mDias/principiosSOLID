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
public class Desconto {
    
    private String tipoDesconto;
    
    public Desconto(String tipoDesconto){
        this.tipoDesconto = tipoDesconto;
    }
    
    public double calcularDesconto(Produto p) {
        if(this.tipoDesconto.equals("Liquidacao")){
            return p.getEstoque().getQuantidade() > 100 ? p.getValorUnitario() * 0.1 : 0;
        }else if(this.tipoDesconto.equals("Tipo Produto")){
            return p.getValorUnitario() * p.getTipoProduto().getDesconto();
        }
        return 0;
    }
    
}
