public class Quadrado implements CalculadoraDeArea{

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double resultado = primeiraMedida * segundaMedida;
        return resultado;
    }
}
