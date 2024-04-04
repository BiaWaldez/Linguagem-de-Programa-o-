import java.util.Scanner;

public class TestaLoteria {
    public static void main(String[] args) {
        Loteria loterica = new Loteria();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n**************************");
            System.out.println("Menu LOTOFÁCIL: ");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("\n**************************\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    loterica.apostarDe0a100();
                    break;
                case 2:
                    loterica.apostarDeAaZ();
                    break;
                case 3:
                    loterica.apostarParOuImpar();
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("------Opção Inválida------");

            }
        } while (opcao != 0);
    }
}