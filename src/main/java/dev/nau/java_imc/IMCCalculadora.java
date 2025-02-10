package dev.nau.java_imc;

public class IMCCalculadora {
    private double peso;
        private double estatura;

        public IMCCalculadora(double peso, double estatura) {
            this.peso = peso;
            this.estatura = estatura;
        }

        public double calcularIMC() {
            return peso / (estatura * estatura);
        }
}
