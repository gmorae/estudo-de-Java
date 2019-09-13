package app;
// Importando a classe Scanner para armazenamento
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma nova scanner
        Scanner entrada = new Scanner(System.in);
        // Mensagem de boas vindas para o sistema
        System.out.println("Sistema de login");
        System.out.println("------------------");
        // Declação de variaveis
        int login, senha;

        // Pergunta para o ususario
        System.out.println("Digite seu login: ");

        // Armazenando o valor que foi digitado dento da variavel login
        login = entrada.nextInt();

        System.out.println("Digite sua senha: ");
        senha = entrada.nextInt();

        // Verificalção dos campos 
        // Se login for igual 1234 e a senha for igual 5678
        if((login == 1234) && (senha == 5678)){

            // Irá mostrar uma mensagem de boas vindas
            System.out.println("Usuário logado com sucesso");
        }else{

            
            // Caso contrario a senha ou login estará invalidos
            System.out.println("Login ou senha invalidos");
        }


    }
}