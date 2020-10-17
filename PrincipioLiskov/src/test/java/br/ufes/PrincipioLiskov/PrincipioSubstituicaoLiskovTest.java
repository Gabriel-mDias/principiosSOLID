package br.ufes.PrincipioLiskov;

import br.ufes.PrincipioLiskov.ProdutoEscolar;
import br.ufes.PrincipioLiskov.CarrinhoLiskov;
import br.ufes.PrincipioLiskov.ProdutoLimpeza;
import br.ufes.PrincipioLiskov.FecharPedidoLiskov;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */
public class PrincipioSubstituicaoLiskovTest {
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
        CarrinhoLiskov c = new CarrinhoLiskov();
        c.addProdutos(new ProdutoEscolar("Lápis", 2, 20));
        c.addProdutos(new ProdutoLimpeza("Detergente Ipê", 5, 80));
        
        FecharPedidoLiskov fp = new FecharPedidoLiskov(c);
        assertEquals(7,fp.getValorTotal(), 0.001);
    }
}
