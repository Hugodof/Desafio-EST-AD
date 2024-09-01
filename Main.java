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
                // A entrada do valor é feita pelo usuário
                System.out.print("Digite a String que deseja: ");
                String str = in.next();
                // Chama a função
                inverter(str);
            } else if (op == 3) {
                // Valores predefinidos no desafio
                double sp = 67836.43;
                double rj = 36678.66;
                double mg = 29229.88;
                double es = 27165.48;
                double outros = 19849.53;
                // Chama a função
                distribuidora(sp, rj, mg, es, outros);
            } else {
                System.out.println("Opção inválida.");
            }

        } while (true);

        in.close();
    }

    public static void menu() {
        System.out.println("Digite"
                + "\n[0] Encerrar o programa"
                + "\n[1] Fibonacci (Questão 2)"
                + "\n[2] Inverter String (Questão 5)"
                + "\n[3] Consultar distribuidora (Questão 4)");
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

    public static void inverter(String str) {
        int aux = str.length() - 1;
        String resultado = "";

        for (int i = aux; i >= 0; i--) {
            resultado = resultado + str.charAt(i);
        }

        System.out.println("\n" + resultado + "\n");
    }

    public static void distribuidora(double sp, double rj, double mg, double es, double outros) {
        double total = sp + rj + mg + es + outros;

        double resultadoSP = (sp / total) * 100;
        double resultadoRJ = (rj / total) * 100;
        double resultadoMG = (mg / total) * 100;
        double resultadoES = (es / total) * 100;
        double resultadoOutros = (outros / total) * 100;

        System.out.println("\nSP teve um percentual de " + resultadoSP + "%");
        System.out.println("RJ teve um percentual de " + resultadoRJ + "%");
        System.out.println("MG teve um percentual de " + resultadoMG + "%");
        System.out.println("ES teve um percentual de " + resultadoES + "%");
        System.out.println("Outros tiveram um percentual de " + resultadoOutros + "%\n");
    }

}