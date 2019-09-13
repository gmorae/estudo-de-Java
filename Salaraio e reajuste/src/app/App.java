package app;

import java.util.Scanner;
public class App
{
	public static void main(String[] args) {
		
        Scanner entrada = new Scanner(System.in);
        float salario, reajuste;
        System.out.print("Digite seu salário: ");
        salario = entrada.nextFloat();
        System.out.print("Digite seu reajuste: ");
        reajuste = entrada.nextFloat();
        
        float total = (salario * reajuste)/100;
        float bruto = total + salario;
    
        System.out.print("Seu salario bruto é: " + bruto);
	}
}

