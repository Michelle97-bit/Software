/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agp.docente.controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Monik
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({agp.docente.controlador.ControladorEstudianteIT.class, agp.docente.controlador.ControladorNotasIT.class, agp.docente.controlador.ControladorDocenteIT.class, agp.docente.controlador.ControladorMateriaIT.class})
public class ControladorITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
