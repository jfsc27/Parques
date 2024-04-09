package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class RectanguloTest {
     private static final Logger LOG = Logger.getLogger(RectanguloTest.class.getName());

    @Test
    public void calcularArea() {
        LOG.info("Iniciado test para calcular area de un rectangulo");
        Rectangulo rectangulo = new Rectangulo(10, 20);
        double areaCalculada = rectangulo.calcularAreaRectangulo();
        assertEquals(200.0, areaCalculada);
        LOG.info("Finalizando test para calcular el area de un rectangulo");
    }

    @Test
    public void calcularAreaAnchoNegativo () {
        LOG.info("Iniciado test para calcular area de un rectangulo con un ancho negativo");
        assertThrows(Throwable.class, () -> new Rectangulo (-10, 20));
        LOG.info("Finalizando test para calcular area de un rectangulo con un ancho negativo");
    }

    @Test
    public void calcularAreaLargoNegativo () {
        LOG.info("Iniciado test para calcular area de un rectangulo con un largo negativo");
        assertThrows(Throwable.class, () -> new Rectangulo(10, -20));
        LOG.info("Finalizando test para calcular area de un rectangulo con un largo negativo");
    }
}
