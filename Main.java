import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        do {
            menu();
            op = in.nextInt();
            if (op == 0) {
                System.out.println("Encerrando...");
                break;
            } else if (op == 1) {
                // A entrada do valor é feita pelo usuário
                System.out.print("Digite o número que deseja: ");
                int valor = in.nextInt();
                // Chama a função
                fibonacci(valor);
            } else if (op == 2) {
                
            } else {
                System.out.println("Opção inválida.");
            }

        } while (true);

        in.close();
    }

    public static void menu() {
        System.out.println("Digite"
                + "\n[0] Encerrar o programa"
                + "\n[1] Fibonacci"
                + "\n[2] ...");
    }

    public static void fibonacci(int valor) {
        int ant = 1, prox = 1, aux = 0;

        if (valor <= 0) {
            System.out.println("\nEste número não pertence a Fibonacci.\n");
            return;
        }

        while (true) {
            if (valor == aux || valor == aux) { // True
                System.out.println("\nEste número pertence a Fibonacci!\n");
                break;
            } else if (valor < aux) { // False
                System.out.println("\nEste número não pertence a Fibonacci.\n");
                break;
            } else {
                aux = prox + ant;
                ant = prox;
                prox = aux;
            }
        }
    }

}