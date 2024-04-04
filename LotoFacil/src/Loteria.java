import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Loteria {
    private Random random;
    private Scanner scanner;

    public Loteria() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void apostarDe0a100() {
        try {
            System.out.println("\nAposte em um números entre 0 a 100: ");
            int aposta = scanner.nextInt();

            if (aposta < 0 || aposta > 100) {
                System.out.println("------Opção Inválida------");

                return;
            }

            int numeroSorteado = random.nextInt(101);

            if (aposta == numeroSorteado) {
                System.out.println("\n-----Você ganhou R$ 500,00 reais.-----");
            } else {
                System.out.println("\nTente outra vez! :( O número sorteado foi: " + numeroSorteado);
            }
        } catch (InputMismatchException e) {

            System.out.println("------Opção Inválida------");

            System.out.print(e.getMessage());
        }
    }

    public void apostarDeAaZ() {
        try {
            System.out.println("\nAposte em uma letra entre A a Z: ");
            int aposta = System.in.read();
            char letraEscolhida = Character.toUpperCase((char)aposta);

            if (!Character.isLetter(letraEscolhida) || (letraEscolhida < 'A' || letraEscolhida > 'Z')) {

                System.out.println("------Opção Inválida------");

                return;
            }

            char letraPremiada = 'G';

            if (letraEscolhida == letraPremiada) {
                System.out.println("\n-----Você ganhou R$ 800,00 reais.-----");
            } else {
                System.out.println("\nQue pena! :( A letra sorteada foi: " + letraPremiada);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro de I/O: " + e.getMessage());
            throw new RuntimeException(e);
        } catch (InputMismatchException e) {

            System.out.println("------Opção Inválida------");
            System.out.print(e.getMessage());

        }
    }

    public void apostarParOuImpar() {
        try {
            System.out.println("\nEscolha um número inteiro: ");
            int aposta = scanner.nextInt();

            if (!scanner.hasNextInt()) {

                System.out.println("------Opção Inválida------");


            } else {
                if (aposta % 2 == 0) {

                    System.out.println("\n-----Você ganhou R$ 300,00 reais.-----");
                } else {


                    System.out.println("\nTente outra vez! :( O número digitado é ímpar e a premiação foi para números pares.");
                }
            }
        }  catch (InputMismatchException e) {

            System.out.println("------Opção Inválida------");
            System.out.print(e.getMessage());
        }
    }
}