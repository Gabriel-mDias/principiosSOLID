/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naSeRepita;

import br.ufes.models.Produto;
import br.ufes.models.TipoProduto;
import br.ufes.naoSeRepita.*;
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
public class NaoSeRepitaTest {
    
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
        CarrinhoDRY c = new CarrinhoDRY();
        TipoProduto tipo = new TipoProduto("Material Escolar", 0.02);
        Produto p1 = new Produto("Lápis", 2, 150, tipo);
        Produto p2 = new Produto("Borracha", 2, 10, tipo);
        
        c.addProdutos(p1);
        c.addProdutos(p2);
        
        FecharPedidoDRY fp = new FecharPedidoDRY(c);
        fp.removerProduto(p2);
        assertEquals(2, fp.getValorTotal(), 0.001);

    }
    
}
