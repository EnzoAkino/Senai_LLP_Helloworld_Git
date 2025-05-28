package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Tubo{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double area, raio, diametro, altura;
        System.out.println("Digite o valor do diametro: ");
        System.out.println("Digite o valor da altura: ");
        diametro = leia.nextDouble();
        altura = leia.nextDouble();
        raio = diametro / 2;
        area = (2 * 3.14) * ((raio * raio) + altura);
        System.out.println("A area do tubo é: " + area);
    }
}