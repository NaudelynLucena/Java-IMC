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

        public String obtenerClasificacion() {
            double imc = calcularIMC();
            if (imc >= 18.5 && imc < 25) {
                return "Peso normal";
            }
            if (imc < 16) {
                return "Delgadez severa";
            }
            else if (imc < 17) {
                return "Delgadez moderada";
            }
            else if (imc < 18.5) {
                return "Delgadez leve";
            }
            else if (imc < 30) {
                return "Sobrepeso";
            }
            else if (imc < 35) {
                return "Obesidad leve";
            }
            return "Clasificación no implementada";
        }
}
