/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.reusoComposicao;

import br.ufes.models.Produto;

/**
 *
 * @author gabriel
 */
public class Desconto {
    
    private DescontoLiquidacao dl;
    private DescontoTipo dt;

    public Desconto(DescontoLiquidacao dl) {
        this.dl = dl;
        this.dt = null;
    }

    public Desconto(DescontoTipo dt) {
        this.dt = dt;
        this.dl = null;
    }

    public DescontoLiquidacao getDl() {
        return dl;
    }

    public DescontoTipo getDt() {
        return dt;
    }
    
    public double aplicarDesconto(Produto p){
        double totalDesconto = 0;
        totalDesconto += dl != null ? dl.calcularDesconto(p) : 0;
        totalDesconto += dt != null ? dt.calcularDesconto(p) : 0;
        
        return totalDesconto;
    }
    
}
