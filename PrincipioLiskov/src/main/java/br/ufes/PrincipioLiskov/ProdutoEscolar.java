/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.PrincipioLiskov;

import br.ufes.models.Produto;
import br.ufes.models.TipoProduto;

/**
 *
 * @author gabriel
 */
public class ProdutoEscolar extends Produto{
    
        //Essa subclasse é evitável de acordo com a ultima atividade, porém, o objetivo é apenas exemplificar o princípio de Liskov
    public ProdutoEscolar(String nome, double valorUnitario, double quantidade) {
        super(nome, valorUnitario, quantidade, new TipoProduto("Material Escolar", 0.02));
    }

}
