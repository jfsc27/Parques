package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CuadradoTest {
    private static final Logger LOG = Logger.getLogger(CuadradoTest.class.getName());

    @Test
    public void calcularAreaLadoPositivo () {
        LOG.info("Iniciado test para calcular area de un cuadrado con lado positivo");
        Cuadrado cuadrado = new Cuadrado(10);
        double areaCalculada = cuadrado.calcularArea();
        assertEquals(100.0, areaCalculada);
        LOG.info("Finalizando test para calcular area de un cuadrado con lado positivo");
    }

    @Test
    public void calcularAreaLadoNegativo () {
        LOG.info("Iniciado test para calcular area de un cuadrado con lado negativo");
        assertThrows(Throwable.class, () -> new Cuadrado (-10));
        LOG.info("Finalizando test para calcular area de un cuadrado con lado negativo");
    }
}
