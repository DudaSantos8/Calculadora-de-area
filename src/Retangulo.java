public class Retangulo extends FormasGeometricas implements CalculadoraDeArea{

    public Retangulo(double lados) {
        super(lados);
    }

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double resultado = primeiraMedida * segundaMedida;
        return resultado;
    }
}
