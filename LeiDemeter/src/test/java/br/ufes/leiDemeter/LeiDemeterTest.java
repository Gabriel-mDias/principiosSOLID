package br.ufes.leiDemeter;

import br.ufes.models.Produto;
import br.ufes.models.TipoProduto;
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
public class LeiDemeterTest {
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
        CarrinhoLOD c = new CarrinhoLOD();
        TipoProduto tipo = new TipoProduto("Material Escolar", 0.02);
        Produto p1 = new Produto("Lápis", 2, 150, tipo);
        Produto p2 = new Produto("Borracha", 2, 10, tipo);
        
        c.addProdutos(p1);
        c.addProdutos(p2);
        c.addDesconto(new DescontoTipo());
        c.addDesconto(new DescontoLiquidacao());
        
        FecharPedidoLOD fp = new FecharPedidoLOD(c);
            //Desconto do tipo será o mesmo em ambos, então retirei 2% do valor Total e 10% do valor do Lápis, já que seu estoque era superior a 100 unidades, entrando em liquidação
        assertEquals(4 * 0.98 - (2 * 0.1), fp.getValorTotal(), 0.001);
    }
    
    @Test
    public void CT02(){
        br.ufes.errado.CarrinhoLOD c = new br.ufes.errado.CarrinhoLOD();
        TipoProduto tipo = new TipoProduto("Material Escolar", 0.02);
        Produto p1 = new Produto("Lápis", 2, 150, tipo);
        Produto p2 = new Produto("Borracha", 2, 10, tipo);
        
        c.addProdutos(p1);
        c.addProdutos(p2);
        c.addDesconto(new br.ufes.errado.DescontoTipo());
        c.addDesconto(new br.ufes.errado.DescontoLiquidacao());
        
        br.ufes.errado.FecharPedidoLOD fp = new br.ufes.errado.FecharPedidoLOD(c);
        assertEquals(4 * 0.98 - (2 * 0.1), fp.getValorTotal(), 0.001);
    }
    
}
