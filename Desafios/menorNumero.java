package Principal;

import java.util.Scanner;

public class menorNumero {
    public static void main (String args [])
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int menor;


        System.out.printf("Digite um número: ");
        numero1 = entrada.nextInt();

        System.out.printf("Digite outro número: ");
        numero2 = entrada.nextInt();

        System.out.printf("Digite outro número: ");
        numero3 = entrada.nextInt();


        if( numero1 < numero2 && numero1 < numero3) {
            menor = numero1;
        }
        else if( numero2 < numero1 && numero2 < numero3 ) {
            menor = numero2;
        } else {
            menor = numero3; }

        System.out.printf("\nO menor número digitado foi: %d\n",menor);


    }

}