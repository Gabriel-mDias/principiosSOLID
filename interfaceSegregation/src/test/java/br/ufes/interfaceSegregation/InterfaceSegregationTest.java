package br.ufes.interfaceSegregation;


import br.ufes.errado.*;
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
public class InterfaceSegregationTest {
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
        //Versão com erro    
    @Test
    public void CT01(){
        TipoProduto tp = new TipoProduto("Material de limpeza", 0);
        Produto p = new Produto("Detergente Ipê", 5, 150, tp);
        br.ufes.errado.DescontoLiquidacao dl = new br.ufes.errado.DescontoLiquidacao();
        assertEquals(tp.getTipo(), dl.tipoDesconto(p));
    }
    
    @Test
    public void CT02(){
        TipoProduto tp = new TipoProduto("Material de limpeza", 0.05);
        Produto p = new Produto("Detergente Ipê", 5, 150, tp);
        br.ufes.interfaceSegregation.DescontoLiquidacao dl = new br.ufes.interfaceSegregation.DescontoLiquidacao();
        assertEquals(p.getValorUnitario()*0.1, dl.calcularDesconto(p), 0.001);
    }
    
}
