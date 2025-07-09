
public class App {
    public static void main(String[] args) {

        Cliente venillon = new Cliente();
        venillon.setNome("Venillon");
        Conta cc = new ContaCorrente(venillon);
        Conta poupanca = new ContaPoupanca(venillon);

        cc.depositar(100);
        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Banco banco = new Banco("banco do Brasil");
        Banco.listarContasClientes(banco, cc, poupanca, venillon);
    }

}
