package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double CustoFabrica, CustoFinal, ImpostoPagar, PerDist;
        System.out.println("Entre com o valor carro na fabrica:");
        CustoFabrica = entrada.nextDouble();

        PerDist = (CustoFabrica * 0.28);
        CustoFinal = (CustoFabrica + PerDist) * 1.45;
        ImpostoPagar = (CustoFinal * 0.45);

        System.out.println("% do distribuidor: " +(PerDist));
        System.out.println("CustoFinal: " +(CustoFinal));
        System.out.println("Imposto a pagar: " +(ImpostoPagar));
        System.out.printf("Imposto a pagar: %.2f",ImpostoPagar); //2 casas apos a virgula, usando "VIRGULA"




        entrada.close();
    }
     
}
