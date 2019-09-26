package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n = entrada.nextInt();
        if (n % 2 == 0) {
            System.out.println("O número digitado é par");
        }else{
            System.out.println("O número digitado é impar");
        }
    }
}