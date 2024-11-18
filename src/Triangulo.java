public class Triangulo implements CalculadoraDeArea{

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double resultado = (primeiraMedida * segundaMedida)/2;
        return resultado;
    }
}
