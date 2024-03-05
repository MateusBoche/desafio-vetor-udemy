package programa;

import entidades.Pessoa;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Programa app = new Programa();
        app.start();
    }

    private void start() {
        Pessoa pessoa = new Pessoa();
        Scanner sc = new Scanner(System.in);
        Pessoa[] vetor = new Pessoa[10];
        System.out.println("Quantos quartos voce quer alugar? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Rent #"+(i+1) + ":");
            sc.nextLine();
            System.out.println("nome: ");
            String nome = sc.nextLine();
            System.out.println("email: ");
            String email = sc.nextLine();
            System.out.println("Qual quarto vai querer? ");
            int quarto = sc.nextInt();
            vetor[quarto] = new Pessoa(nome,email);
        }
        System.out.println("Busy rooms: ");
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] != null) {
                System.out.println(i + ":" + vetor[i]);
            }

        }
    }
}
