public class Triangulo extends FormasGeometricas implements CalculadoraDeArea{

    public Triangulo(double lados) {
        super(lados);
    }

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double resultado = (primeiraMedida * segundaMedida)/2;
        return resultado;
    }
}
