package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ZonaTest {
     private static final Logger LOG = Logger.getLogger(ZonaTest.class.getName());

    @Test
    public void zonaCircularArena() {
        LOG.info("Iniciado test de zona circular en arena");
        Zona zona = new Zona("Zona 1", new Circulo(10), Material.ARENA);
        assertEquals(3141592.65, zona.calcularValor(), 0.01);
        LOG.info("Finalizando test de zona circular en arena");
    }

    @Test
    public void zonaRectangularGramaSintetica() {
        LOG.info("Iniciado test de zona rectangular en grama sintetica");
        Zona zona = new Zona("Zona 1", new Rectangulo(10, 20), Material.GRAMA_SINTETICA);
        assertEquals(7000000.00, zona.calcularValor(), 0.01);
        LOG.info("Finalizando test de zona rectangular en grama sintetica");
    }

    @Test
    public void zonaCuadradaGramaNatural() {
        LOG.info("Iniciado test de zona cuadrada en grama natural");
        Zona zona = new Zona("Zona 1", new Cuadrado(10), Material.GRAMA_NATURAL);
        assertEquals(2000000.00, zona.calcularValor(), 0.01);
        LOG.info("Finalizando test de zona cuadrada en grama natural");
    }

    @Test
    public void zonaTriangularAsfalto() {
        LOG.info("Iniciado test de zona triangular en asfalto");
        Zona zona = new Zona("Zona 1", new Triangulo(10, 20), Material.ASFALTO);
        assertEquals(4000000.00, zona.calcularValor(), 0.01);
        LOG.info("Finalizando test de zona triangular en asfalto");
    }


}
