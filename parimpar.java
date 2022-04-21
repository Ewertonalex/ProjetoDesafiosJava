package exercicio;

import java.util.Scanner;

public class parimpar {
    public static void main(String[] argss){
        Scanner ent = new Scanner(System.in);
        int num;

        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um número: ");
            num = ent.nextInt();

            if(num % 2 == 0){
                System.out.println("O número " + num + " é PAR!");

            } else {
                System.out.println("O número " + num + " é ÍMPAR!");
            }

        }


    }
}

