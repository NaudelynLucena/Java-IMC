package dev.nau.java_imc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IMCCalculadoraTest {

    @Test
    public void testCalcularIMC() {
        IMCCalculadora calculadora = new IMCCalculadora(70.0, 1.75);
        assertEquals(22.86, calculadora.calcularIMC(), 0.01);
    }

}
