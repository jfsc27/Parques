package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class TrianguloTest {
     private static final Logger LOG = Logger.getLogger(TrianguloTest.class.getName());

    @Test
    public void calcularAreaPositiva () {
        LOG.info("Iniciado test para calcular el area de un triangulo");
        Triangulo triangulo = new Triangulo(10, 20);
        double areaCalculada = triangulo.calcularArea();
        assertEquals(100.0, areaCalculada);
        LOG.info("Finalizando test para calcular el area de un triangulo");
    }

    @Test
    public void calcularAreaBaseNegativa () {
        LOG.info("Iniciado test para calcular el area de un triangulo con la base negativa");
        assertThrows(Throwable.class, () -> new Triangulo(-10, 20));
        LOG.info("Finalizando test para calcular el area de un triangulo con la base negativa");
    }

    @Test
    public void calcularAreaAlturaNegativa () {
        LOG.info("Iniciado test para calcular el area de un triangulo con la altura negativa");
        assertThrows(Throwable.class, () -> new Triangulo(10, -20));
        LOG.info("Finalizando test para calcular el area de un triangulo con la altura negativa");
    }
}
