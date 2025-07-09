
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;

    private List<Conta> contas;

    private List<Cliente> clientes;

    public Banco(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    private List<Conta> listarContas() {
        System.out.println("Contas do banco: " + this.nome);
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta cadastrada.");
        } else {
            for (Conta conta : contas) {
                System.out.println("Conta: " + conta.getNumero());
            }
        }
        return contas;
    }

    private List<Cliente> listaClientes() {
        System.out.println("Clientes do banco: " + this.nome);
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println("Cliente: " + cliente.getNome());
            }
        }
        return clientes;
    }

    public static void listarContasClientes(Banco banco, Conta cc, Conta p, Cliente c) {
        banco.getNome();
        banco.setContas(List.of(cc, p));
        banco.setClientes(List.of(c));
        banco.listarContas();
        banco.listaClientes();
    }

}
