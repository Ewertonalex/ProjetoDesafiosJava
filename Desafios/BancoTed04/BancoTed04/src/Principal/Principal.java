package Principal;

import java.util.*;


public class Principal {


    public static void main(String[] args){

        ContaService minhaContaService = new ContaService();

        Conta conta = new Conta();


        Scanner sc = new Scanner(System.in);

        String cpf;
        int op;
        float valor;




        do{
            System.out.println();
            System.out.println("-- Olá, bem vindo ao seu banco --");
            System.out.println("-- Digite a opção que deseja realizar: --");
            System.out.println();
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Mostrar dados");
            System.out.println("3 - Depositar valor");
            System.out.println("4 - Sacar valor");
            System.out.println("5 - Mostrar saldo");
            System.out.println("0 - Sair");
            op = sc.nextInt();

            switch(op){


                case 1 :
                    System.out.println("Para cadastrar uma conta, preencha os dados abaixo:");
                    System.out.print("Digite o nome: ");
                    conta.setNome(sc.next());
                    System.out.print("Digite o CPF: ");
                    conta.setCpf(sc.next());
                    System.out.print("Digite o depósito inicial: ");
                    conta.setSaldo(sc.nextDouble());
                    minhaContaService.inseredados(conta);
                    break;

                case 2 :
                    System.out.println("Digite seu CPF: ");
                    cpf = sc.next();
                    minhaContaService.mostrardado(cpf);
                    break;

                case 3 :
                    System.out.println("Digite o valor que deseja depositar: ");
                    valor = sc.nextFloat();
                    minhaContaService.depositar(conta, valor);
                    break;

                case 4:
                    minhaContaService.mostrarsal(conta);
                    System.out.println("Digite o valor que deseja sacar: ");
                    valor = sc.nextFloat();
                    minhaContaService.sacar(conta, valor);
                    break;

                case 5:
                    minhaContaService.mostrarsal(conta);
                    break;
            }
        }while(op != 0);
    }
}



