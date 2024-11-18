import java.text.DecimalFormat;

public class ExecuteSystem {

    public static void runExecute(){
        int control = 0;
        double medida1 = 0;
        double medida2 = 0;
        CalculadoraDeArea calculadoraDeArea = null;

        while (control == 0){
            int opcao = IO.menu();
            if (opcao == 1){
                System.out.println("Insira abaixo a medida do lado do quadrado");
                medida1 = retornarMedida1();
                medida2 = medida1;
                calculadoraDeArea = new Quadrado();
            } else if (opcao == 2) {
                System.out.println("Insira abaixo a largura e altura do retangulo");
                medida1 = retornarMedida1();
                medida2 = retornarMedida2();
                calculadoraDeArea = new Retangulo();
            } else if (opcao == 3) {
                System.out.println("Insira abaixo a altura e a base do triangulo");
                medida1 = retornarMedida1();
                medida2 = retornarMedida2();
                calculadoraDeArea = new Triangulo();
            } else if (opcao == 4) {
                System.out.println("Insira abaixo um dos lados do hexagono");
                medida1 = retornarMedida1();
                medida2 = medida1;
                calculadoraDeArea = new Hexagono();
            }else if (opcao == 5) control = 1;

            assert calculadoraDeArea != null;
            double calculo = calculadoraDeArea.calcularArea(medida1, medida2);
            System.out.println("A área dessa forma geométrica é: "+calculo);


        }
    }

    private static double retornarMedida1(){
        return IO.scanner("\nDigite a medida:").nextDouble();
    }

    private static double retornarMedida2(){
        return IO.scanner("\nDigite a medida:").nextDouble();
    }

}
