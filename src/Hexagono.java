public class Hexagono implements CalculadoraDeArea{

    @Override
    public double calcularArea(double primeiraMedida, double segundaMedida) {
        double primeiroCalculo = ((primeiraMedida * primeiraMedida) * Math.sqrt(3));
        double segundoCalculo = primeiroCalculo*6;
        double resultado = segundoCalculo/4;
        return  resultado;
    }
}
