package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2;
        System.out.println("Digite a 1a nota:");
        nota1 = entrada.nextInt();
        
        System.out.println("Digite a 2a nota:");
        nota2 = entrada.nextInt();
                
        System.out.println("A media das notas e: " +(nota1 + nota2) / 2);

        entrada.close();
    }
}
