/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.dependencyInversion;

import br.ufes.models.Produto;
import br.ufes.models.TipoProduto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author gabriel
 */
public class DependencyInversionTest {
    
    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void CT01(){
        CarrinhoDIP c = new CarrinhoDIP();
        TipoProduto tipo = new TipoProduto("Material Escolar", 0.02);
        Produto p1 = new Produto("Lápis", 2, 150, tipo);
        Produto p2 = new Produto("Borracha", 2, 10, tipo);
        
        c.addProdutos(p1);
        c.addProdutos(p2);
        c.addDesconto(new DescontoTipo());
        c.addDesconto(new DescontoLiquidacao());
        
        FecharPedidoDIP fp = new FecharPedidoDIP(c);
            //Desconto do tipo será o mesmo em ambos, então retirei 2% do valor Total e 10% do valor do Lápis, já que seu estoque era superior a 100 unidades, entrando em liquidação
        assertEquals(4 * 0.98 - (2 * 0.1), fp.getValorTotal(), 0.001);

    }
    
}
