package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, kw, desconto, valorkw,consumo;
        System.out.println("Entre com o salario:");
        salario = entrada.nextDouble();
        System.out.println("Entre com o KW consumido:");
        kw = entrada.nextDouble();
        valorkw = (salario / 500);
        System.out.println("Cada KW custa: " +valorkw);
        consumo = (kw * valorkw);
        System.out.println("O valor em R$ a ser pago: "+(consumo));
        desconto = (consumo * 0.85);
        System.out.println("Valor com desconto: " +(desconto));
        
        entrada.close();
    }
     
}
