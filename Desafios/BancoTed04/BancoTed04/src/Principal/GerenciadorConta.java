package Principal;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorConta {

    public class GerenciadorDeConta {

        List<Conta> listaDeContas;

        public GerenciadorDeConta() {
            listaDeContas = new ArrayList<Conta>();
        }


        public void criarConta(String nome, String cpf, double saldo) {
            Conta conta = new Conta();

            conta.setNome(nome);
            conta.setCpf(cpf);
            conta.setSaldo(saldo);

            adicionarConta(conta);
            ;
        }

        public void adicionarConta(Conta conta) {
            listaDeContas.add(conta);
        }

        public Conta pesquisaConta(String cpf) {
            for (Conta conta : listaDeContas) {
                if (conta.getCpf() == cpf) {
                    return conta;
                }
            }

            //caso nao localize entao retorne um objeto vazio.
            return new Conta();
        }

        public double pesquisarSaldo(String cpf) throws Exception {
            Conta conta = pesquisaConta(cpf);

            if (conta.getCpf().equals(0))
                throw new Exception("Conta solicitada nao existe!");

            return conta.getSaldo();
        }


        public String pesquisarNomeCliente(String cpf) throws Exception {
            Conta conta = pesquisaConta(cpf);

            if (conta.getCpf().equals(0))
                throw new Exception("Conta solicitada nao existe!");

            return conta.getNome();
        }


        public void removerConta(String cpf) {
            Conta conta = pesquisaConta(cpf);

            if (listaDeContas.contains(conta))
                listaDeContas.remove(conta);
        }


        public String listarContas() {
            if (listaDeContas.isEmpty()) {
                return "Nao ha Contas na lista de Conta!";
            } else {
                String resultado = "";
                for (Conta conta : listaDeContas) {
                    resultado +=
                            " Numero: " + conta.getCpf() +
                                    "\t Nome: " + conta.getNome() +
                                    "\t CPF: " + conta.getCpf() +
                                    "\t Saldo: " + conta.getSaldo() + "\n";
                }
                return resultado;
            }
        }

    }
}
