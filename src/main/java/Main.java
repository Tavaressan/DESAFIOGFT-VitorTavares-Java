import model.Cliente;
import model.Pessoa;

public class Main {

    // Método main para executar desafio 2 com instânciação das classes Pessoa e Cliente
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Clara");

        System.out.println("Chamando método de saudação da pessoa: \n");
        pessoa.saudacao();

        Cliente cliente = new Cliente("João", 1234L);

        System.out.println("Chamando método de saudação do cliente: \n");
        cliente.saudacao();
    }
}
