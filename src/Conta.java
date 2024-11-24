public class Conta {

    protected static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1234;

    protected int numero;
    protected int agencia = AGENCIA_PADRAO;
    protected double saldo = 0;
    protected String cliente;

    public Conta() {
        this.numero = SEQUENCIAL++;
        this.agencia = Conta.AGENCIA_PADRAO;
    }

    public void sacar(Double valor){
        if(saldo > valor){
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositar(Double valor){
        saldo = saldo + valor;
    }

    public void transferir(Double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente;
    }
}
