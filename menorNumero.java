package exercicio;

import java.util.Scanner;

public class menorNumero {
    public static void main (String args [])
    {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int menor;


        System.out.printf("Digite um número: ");
        num1 = entrada.nextInt();

        System.out.printf("Digite outro número: ");
        num2 = entrada.nextInt();

        System.out.printf("Digite outro número: ");
        num3 = entrada.nextInt();


        if( num1 < num2 && num1 < num3) {
            menor = num1;
        }
        else if( num2 < num1 && num2 < num3 ) {
            menor = num2;
        } else {
            menor = num3; }

        System.out.printf("\nO menor número digitado foi: %d\n",menor);


    }

}
