package app;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.println("Sistema de contagem de votos");
        System.out.println("----------------------------");

        Scanner a = new Scanner(System.in);

        int votos, nulo, branco, valido;

        System.out.print("Qual a quantiade de votos que teve no município: ");
        votos = a.nextInt();

        System.out.print("Qual a quantiade de votos nulos que teve no município: ");
        nulo = a.nextInt();

        System.out.print("Qual a quantiade d1e votos em branco que teve no município: ");
        branco = a.nextInt();

        System.out.print("Qual a quantiade de votos validos que teve no município: ");
        valido = a.nextInt();

        float resultadonulos = (nulo * 100) / votos;
        float resultadobrancos = (branco * 100) / votos;
        float resultadovalidos = (valido * 100) / votos;

        System.out.println("----------------------------------------------------------");
        System.out.println("Resultados obtidos:");
        System.out.println("");
        System.out.println("O resultado de votos nulos do município em porcentagem é: " + resultadonulos + "%");
        System.out.println("O resultado de votos em brancos do município em porcentagem é: " + resultadobrancos + "%");
        System.out.println("O resultado de votos validos do município em porcentagem é: " + resultadovalidos + "%");

    }
}
