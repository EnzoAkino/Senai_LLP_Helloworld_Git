package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Caixa{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double comprimento, altura, largura, cl, ca, la, total;
        System.out.println("Digite o valor do comprimento: ");
        comprimento = leia.nextDouble();
        System.out.println("Digite o valor da altura: ");
        altura = leia.nextDouble();
        System.out.println("Digite o valor do largura: ");
        largura = leia.nextDouble();
        cl = comprimento * largura;
        ca = comprimento * altura;
        la = altura * largura;
        total = 2 * (cl + ca + la);
        System.out.println("A area da caixa é: " + total);
    }
}