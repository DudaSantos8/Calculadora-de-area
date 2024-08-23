import java.text.DecimalFormat;

public class Execute {
    public static void main(String[] args) {
        DecimalFormat test2 = new DecimalFormat("0.000");
        CalculadoraDeArea teste = new Triangulo(3);

        System.out.println(test2.format(teste.calcularArea(4,5)));

    }
}