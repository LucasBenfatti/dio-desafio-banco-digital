public class TestaBanco {
    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente();
        Conta cc2 = new ContaCorrente();
        Conta cc3 = new ContaCorrente();

        Conta cp1 = new ContaPoupanca();
        Conta cp2 = new ContaPoupanca();

        cc1.depositar(133.0);
        cc1.getSaldo();
        cc1.sacar(15.0);
        System.out.println(String.format("O saldo da conta conrrente número " + cc1.getNumero() + " é de R$%.2f", cc1.saldo));

        cc1.transferir(1500.0, cc2);
        System.out.println(cc1.getSaldo());

        cc2.depositar(127.00);
        cc2.getSaldo();
        System.out.println(String.format("O saldo da conta conrrente número " + cc2.getNumero() + " é de R$%.2f", cc2.saldo));

        cc3.depositar(1500.00);
        cc3.getSaldo();
        System.out.println(String.format("O saldo da conta conrrente número " + cc3.getNumero() + " é de R$%.2f", cc3.saldo));

        cp1.depositar(1554.00);
        cp1.getSaldo();
        System.out.println(String.format("O saldo da conta poupança número " + cp1.getNumero() + " é de R$%.2f", cp1.saldo));

        cp2.depositar(37.0);
        cp2.getSaldo();
        System.out.println(String.format("O saldo da conta poupança número " + cp2.getNumero() + " é de R$%.2f", cp2.saldo));

    }
}