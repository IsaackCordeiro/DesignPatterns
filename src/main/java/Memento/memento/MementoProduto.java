package Memento.memento;

public class MementoProduto {
    private String nome;
    private double custo;
    private double preco;

    public MementoProduto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    public double getCusto() {
        return custo;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
}
