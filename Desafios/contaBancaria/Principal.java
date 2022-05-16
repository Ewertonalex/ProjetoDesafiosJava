package Principal.contaBancaria;

import java.util.Scanner;

public class Principal {

    private static float valor;
    public static void main(String[] args){
        Conta minhaConta = new Conta();

        Scanner sc = new Scanner(System.in);

        String nome;
        int cpf, op;
        float saldo, valor;

        // Iniciando o menu de escolha

        do{
            System.out.println();
            System.out.println("-- Olá, bem vindo a sua Conta Bancária --\n");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Mostrar dados");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sacar valor");
            System.out.println("5 - Mostrar saldo");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            //Inicio dos casos para escolha

            switch(op){

                case 1 :
                    System.out.println("Para cadastrar uma conta, preencha os dados abaixo:");
                    System.out.print("Digite o nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Digite o CPF: ");
                    cpf = sc.nextInt();
                    System.out.print("Digite o depósito inicial: ");
                    saldo = sc.nextFloat();
                    minhaConta.inseredados(nome, cpf, saldo);
                    break;

                case 2 :
                    minhaConta.mostrardado();
                    break;

                case 3 :
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = sc.nextFloat();
                    minhaConta.depositar(valor);
                    break;

                case 4:
                    minhaConta.mostrarsaldo();
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = sc.nextFloat();
                    minhaConta.sacar(valor);
                    break;

                case 5:
                    minhaConta.mostrarsaldo();
                    break;
            }
        }while(op != 0);

        sc.close();
    }
}
