package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Circulo{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double area, raio, diametro;
        System.out.println("Digite o valor do diametro: ");
        diametro = leia.nextDouble();
        raio = diametro / 2;
        area = 3.14 * (raio * raio);
        System.out.println("A area do circulo é: " + area);

    }
}