package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, aumento;
        System.out.println("Entre com o salario:");
        salario = entrada.nextDouble();
        aumento = (salario * 1.25);
        System.out.println("O salario com 25% de aumento e: " +aumento);
        entrada.close();
    }
     
}
