package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class ParqueInfantilTest {
     private static final Logger LOG = Logger.getLogger(ParqueInfantilTest.class.getName());

    @Test
    public void datosNombreNulo() {
        LOG.info("Iniciado test datos nombre nulo");
        assertThrows(Throwable.class, () -> new ParqueInfantil(null, "Parquesito", null, Municipio.ARMENIA));
        LOG.info("Finalizando test datos nombre nulo");
    }

    @Test
    public void datosNombreVacio() {
        LOG.info("Iniciado test datos nombre vacio");
        assertThrows(Throwable.class, () -> new ParqueInfantil("", "Parquesito", null, Municipio.ARMENIA));
        LOG.info("Finalizando test datos nombre vacio");
    }

    @Test
    public void datoDescripcionNula() {
        LOG.info("Iniciado test datos descripcion nula");
        assertThrows(Throwable.class, () -> new ParqueInfantil("Parquesito", null, null, Municipio.ARMENIA));
        LOG.info("Finalizando test datos descripcion nula");
    }

    @Test
    public void datoDescripcionVacia() {
        LOG.info("Iniciado test datos descripcion vacia");
        assertThrows(Throwable.class, () -> new ParqueInfantil("Parquesito", "", null, Municipio.ARMENIA));
        LOG.info("Finalizando test datos descripcion vacia");
    }

    @Test
    public void parqueSinZonas() {
        LOG.info("Iniciado test de parque sin zonas");
        ParqueInfantil parqueInfantil = new ParqueInfantil("Mi primer recuerdo", "Parque para los primeros años de edad", null, Municipio.CALARCA);
        assertEquals(10000.00, parqueInfantil.calcularValor(), 0.01);
        LOG.info("Finalizando test de parques sin zona");
    }

}
