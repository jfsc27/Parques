package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueInfantilTest {
     private static final Logger LOG = Logger.getLogger(ParqueInfantilTest.class.getName());

    @Test
    public void datos() {
        LOG.info("Iniciado test datos nulos");
        assertThrows(Throwable.class, () -> new ParqueInfantil(null, null, null, null));
        LOG.info("Finalizando test datos nulos");
    }
}
