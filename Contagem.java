import java.util.Scanner;

public class Contagem {

    public static void main(String[] args) {
        // Cria um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();
        scanner.close();

        // Chama o método para contar as ocorrências da letra 'a'
        int quantidade = contarLetraA(texto);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    // Método para contar a quantidade de 'a' (maiúsculo e minúsculo) na string
    public static int contarLetraA(String texto) {
        int contador = 0;

        // Percorre a string verificando se cada caractere é 'a' ou 'A'
        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        return contador;
    }
}

