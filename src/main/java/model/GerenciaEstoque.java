package model;

public class GerenciaEstoque {

    private String nome;
    private int quantidade;

    public GerenciaEstoque(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public void retirar(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Retirada de " + quantidade + " unidades realizada com sucesso.");
        } else {
            System.out.println("Não há estoque suficiente para a retirada de " + quantidade + " unidades.");
        }
    }

    public void exibirDados() {
        System.out.println("Item: " + this.nome + ", Quantidade: " + this.quantidade);
    }

    public static void main(String[] args) {
        GerenciaEstoque item = new GerenciaEstoque("Caneta Azul", 50);

        System.out.println("Estoque inicial antes da retirada:");
        item.exibirDados();

        item.retirar(10);

        System.out.println("\nDados finais do estoque:");
        item.exibirDados();
    }
}
