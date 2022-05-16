package Principal.contaBancaria;

public class Conta {

    private int CPF;
    public int op;
    private String Cliente;
    private double Saldo;

    public Conta() {
        this.CPF=0;
        this.Cliente=" ";
        this.Saldo=0;

    }
    public int getNumero() {

        return CPF;
    }
    public void setNumero(int Numero) {

        this.CPF = Numero;
    }
    public String getCliente() {

        return Cliente;
    }
    public void setCliente(String Cliente) {

        this.Cliente = Cliente;
    }
    public double getSaldo() {

        return Saldo;
    }
    public void setSaldo(double Saldo) {

        this.Saldo = Saldo;
    }

    boolean sacar(double quantidade) {
        if (this.Saldo<quantidade)
            return false;
        else {
            this.Saldo = this.Saldo - quantidade;
            return true;
        }
    }
    void depositar(double quantidade) {

        this.Saldo = this.Saldo + quantidade;
    }
    void inseredados(String a, int b, float c){
        this.Cliente = a;
        this.CPF = b;
        this.Saldo = c;

    }
    void mostrardado(){
        System.out.println("Dados da conta: ");
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("CPF: " + this.getNumero());
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    void mostrarsaldo(){
        System.out.println("Saldo Atual: " + this.getSaldo());

    }
}

