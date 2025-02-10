package dev.nau.java_imc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCCalculadoraTest {

    @Test
    public void testCalcularIMC() {
        IMCCalculadora calculadora = new IMCCalculadora(70.0, 1.75);
        assertEquals(22.86, calculadora.calcularIMC(), 0.01);
    }

    @Test
    public void testObtenerClasificacionPesoNormal() {
    IMCCalculadora calculadora = new IMCCalculadora(70.0, 1.75);
    assertEquals("Peso normal", calculadora.obtenerClasificacion());
    }

    @Test
    public void testObtenerClasificacionDelgadezSevera() {
        IMCCalculadora calculadora = new IMCCalculadora(40.0, 1.75);
        assertEquals("Delgadez severa", calculadora.obtenerClasificacion());
    }

    @Test
    public void testObtenerClasificacionDelgadezModerada() {
        IMCCalculadora calculadora = new IMCCalculadora(50.0, 1.75);
        assertEquals("Delgadez moderada", calculadora.obtenerClasificacion());
    }

    @Test
    public void testObtenerClasificacionDelgadezLeve() {
        IMCCalculadora calculadora = new IMCCalculadora(55.0, 1.75);
        assertEquals("Delgadez leve", calculadora.obtenerClasificacion());
    }
}
