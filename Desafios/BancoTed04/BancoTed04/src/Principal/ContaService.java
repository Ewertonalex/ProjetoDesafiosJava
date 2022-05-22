package Principal;

import java.util.ArrayList;

public class ContaService {

    ArrayList<Conta> contasBancarias;

    public ContaService() {
        contasBancarias = new ArrayList<Conta>();
    }

    boolean sacar(Conta conta, double quantidade) {
        if (conta.getSaldo() < quantidade)
            return false;
        else {
            conta.setSaldo(conta.getSaldo() - quantidade);
            return true;
        }
    }
    void depositar(Conta conta, double quantidade) {

        conta.setSaldo(conta.getSaldo() + quantidade);
    }
    public void inseredados(Conta conta){
        contasBancarias.add(conta);
    }
   public void mostrardado(String cpf){

       for (int i = 0; i < contasBancarias.size(); i++) {
           if (cpf.equals(contasBancarias.get(i).getCpf())) {
               System.out.println("Dados da conta: ");
               System.out.println("Cliente: " + contasBancarias.get(i).getNome());
               System.out.println("CPF: " + contasBancarias.get(i).getCpf());
               System.out.println("Saldo atual: " + contasBancarias.get(i).getSaldo());

           } else {
               System.out.printf("Conta nao encontrada!!!");
           }
       }
    }
    void mostrarsal(Conta conta){
        System.out.println("Saldo Atual: " + conta.getSaldo());

    }

}

