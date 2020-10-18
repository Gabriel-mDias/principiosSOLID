/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufes.naoSeRepita;

import org.junit.After;
import org.junit.AfterClass;
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
        br.ufes.errado.Funcionario f = new br.ufes.errado.Funcionario("José", "Av. 25 de novembro", "40028922", 1500.00, "Limpeza");
        br.ufes.errado.Gerente g = new br.ufes.errado.Gerente("Claudio", "Av. 01 de Janeiro", "22894002", 4500.00, "Limpeza");
    }
    
    @Test
    public void CT02(){
        br.ufes.naoSeRepita.Pessoa f = new br.ufes.naoSeRepita.Funcionario("José", "Av. 25 de novembro", "40028922", 1500.00, "Limpeza");
        br.ufes.naoSeRepita.Pessoa g = new br.ufes.naoSeRepita.Gerente("Claudio", "Av. 01 de Janeiro", "22894002", 4500.00, "Limpeza");
    }
}
