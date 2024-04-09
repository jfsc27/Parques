package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CirculoTest {
    private static final Logger LOG = Logger.getLogger(CirculoTest.class.getName());

    @Test
    public void calcularAreaPositiva () {
        LOG.info("Iniciado test para calcular area positiva");
        Circulo circulo = new Circulo(10);
        double areaCalculada =circulo.calcularAreaCirculo();
        assertEquals(314.159, areaCalculada, 0.01);
        LOG.info("Finalizando test para calcular area positiva");
    }

    @Test
    public void calcularAreaNegativa () {
        LOG.info("Iniciando test para calcular area negativa");
        assertThrows(Throwable.class, () -> new Circulo(-10));
        LOG.info("Finalizando test para calcular area negativa");
    }
}
