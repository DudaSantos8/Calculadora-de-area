import java.text.DecimalFormat;

public class ExecuteSystem {

    public static void runExecute(){
        DecimalFormat limitarCasasDecimais = new DecimalFormat("0.00");
        boolean control = true;
        double pedirPrimeiraMedida = 0;
        double pedirSegundaMedida = 0;
        CalculadoraDeArea calculadoraDeArea = null;

        while (control){
            int opcao = IO.menu();
            if (opcao == 1){
                pedirPrimeiraMedida = IO.scanner("Digite a medida do lado do quadrado:").nextDouble();
                pedirSegundaMedida = pedirPrimeiraMedida;
                calculadoraDeArea = new Quadrado(4);
            } else if (opcao == 2) {
                pedirPrimeiraMedida = IO.scanner("Digite a medida da base do retângulo:").nextDouble();
                pedirSegundaMedida = IO.scanner("Digite a medida da altura do retângulo:").nextDouble();
                calculadoraDeArea = new Retangulo(4);
            } else if (opcao == 3) {
                pedirPrimeiraMedida = IO.scanner("Digite a medida da base do triângulo:").nextDouble();
                pedirSegundaMedida = IO.scanner("Digite a medida da altura do triângulo:").nextDouble();
                calculadoraDeArea = new Triangulo(3);
            } else if (opcao == 4) {
                pedirPrimeiraMedida = IO.scanner("Digite a medida de um dos lados do hexágono:").nextDouble();
                pedirSegundaMedida = pedirPrimeiraMedida;
                calculadoraDeArea = new Hexagono(6);
            } else if(opcao == 5) control = false;
            else throw new RuntimeException("Opção invalida");

            double calculo = calculadoraDeArea.calcularArea(pedirPrimeiraMedida, pedirSegundaMedida);
            System.out.println(limitarCasasDecimais.format("A área dessa forma geométrica é: "+calculo));
        }
    }

}
