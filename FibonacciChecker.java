import java.util.Scanner;

public class FibonacciChecker {

    public static void main(String[] args) {
        // Cria um scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número para verificar se está na sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    // Método que verifica se o número pertence à sequência de Fibonacci
    public static boolean pertenceAFibonacci(int numero) {
        // Inicia os dois primeiros números da sequência
        int a = 0;
        int b = 1;

        // Verifica se o número é 0 ou 1, que pertencem à sequência
        if (numero == a || numero == b) {
            return true;
        }

        // Calcula os próximos números da sequência até encontrar o número ou passar dele
        int proximo = a + b;
        while (proximo <= numero) {
            if (proximo == numero) {
                return true;
            }
            a = b;
            b = proximo;
            proximo = a + b;
        }

        // Retorna false se o número não foi encontrado na sequência
        return false;
    }
}
