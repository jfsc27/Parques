package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ProyectoTest {
    private static final Logger LOG = Logger.getLogger(ProyectoTest.class.getName());

    @Test
    public void proyectoSinParques() {
        LOG.info("Iniciado test de proyecto sin");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
}
