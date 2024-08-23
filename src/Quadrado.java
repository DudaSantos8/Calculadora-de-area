public class Quadrado extends FormasGeometricas implements CalculadoraDeArea{

    public Quadrado(double lados) {
        super(lados);
    }

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double resultado = primeiraMedida * segundaMedida;
        return resultado;
    }
}
