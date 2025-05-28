package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Retangulo{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int base, altura, area;
        System.out.println("Digite o valor da base: ");
        base = leia.nextInt();
        System.out.println("Digite o valor da altura: ");
        altura = leia.nextInt();
        area = (base * altura);
        System.out.println("O valor da area é: " + area);
    }
}