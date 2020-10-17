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
public class CarrinhoDIP {
    private List<Produto> produtos;
    private List<DescontoLiquidacao> descontosLiquidacao;
    private List<DescontoTipo> descontosTipo;
    
    public CarrinhoDIP() {
        produtos = new ArrayList<>();
        descontosLiquidacao = new ArrayList<>();
        descontosTipo = new ArrayList<>();
    }
    
    public void addProdutos(Produto p){
        produtos.add(p);
    }
    
    public void addDescontoLiquidacao(DescontoLiquidacao d){
        if(this.descontosLiquidacao.contains(d))
            throw new RuntimeException("Desconto já inserido!\n");
        this.descontosLiquidacao.add(d);
    }
    
    public void addDescontoTipo(DescontoTipo d){
        if(this.descontosTipo.contains(d))
            throw new RuntimeException("Desconto já inserido!\n");
        this.descontosTipo.add(d);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public List<br.ufes.errado.DescontoLiquidacao> getDescontosLiquidacao() {
        return descontosLiquidacao;
    }

    public List<br.ufes.errado.DescontoTipo> getDescontosTipo() {
        return descontosTipo;
    }
    
}
