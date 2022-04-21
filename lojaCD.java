package exercicio;

import java.util.Scanner;

public class lojaCD {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cor;
        float valor1 = 10;


        System.out.printf("Digite o número de acordo com a Cor do seu CD,\n" +
                "1 - VERDE, " +
                "2 - AZUL, " +
                "3 - AMARELO, " +
                "4 - VERMELHO:\n");


        cor = entrada.nextInt();

        if (cor == 1) {
            System.out.print("Seu CD é VERDE!\nValor: R$" +valor1 );
        } else if (cor == 2) {
            valor1 = valor1 + 10;
            System.out.print("Seu CD é AZUL!\nValor: R$" +valor1);
        } else if (cor == 3) {
            valor1 = valor1 + 20;
            System.out.print("Seu CD é AMARELO!\nValor: R$" +valor1);
        } else if (cor == 4) {
            valor1 = valor1 + 30;
            System.out.print("Seu CD é VERMELHO!\nValor: R$" +valor1);
        }

    }

}





