/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.leiDemeter;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public interface Desconto {
    
    public double calcularDesconto(Produto p);
    
}
