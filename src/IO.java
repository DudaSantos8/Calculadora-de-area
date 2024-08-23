import java.util.Scanner;

public class IO {
    public static Scanner scanner (String message){
        System.out.println(message);
        return new Scanner(System.in);
    }

    public static int menu (){
        StringBuilder model = new StringBuilder();
        model.append("\n-----------------------------\n");
        model.append("Calculando a área");
        model.append("\n-----------------------------\n");
        model.append("Digite:");
        model.append("\n");
        model.append("1 para quadrado");
        model.append("\n");
        model.append("2 para retângulo");
        model.append("\n");
        model.append("3 para triângulo");
        model.append("\n");
        model.append("4 para hexágono");
        model.append("\n");
        model.append("5 sair");
        model.append("\n-----------------------------\n");
        System.out.println(model);
        return new Scanner(System.in).nextInt();
    }
}
