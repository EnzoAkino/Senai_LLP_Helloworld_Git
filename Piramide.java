package Senai_LLP_Variaveis_Geometria;

import java.util.Scanner;

public class Piramide{
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double ladoBase, apotema, areaBase, areaLateral, areaTotal;
        System.out.println("Digite o valor da base: ");
        ladoBase = leia.nextInt();
        System.out.println("Digite o valor da lateral inclinada: ");
        apotema = leia.nextInt();
        areaBase = Math.pow(ladoBase, 2);
        areaLateral = 4 * (ladoBase * apotema /2);
        areaTotal = areaBase * areaLateral;
        System.out.println("a area da piramide é: " + areaTotal);

    }
}