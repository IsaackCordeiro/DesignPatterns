package Composite.composite;

public abstract class Componente {
    protected String nome;
    protected double preco;

    public Componente(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract String getNome();
    public abstract double getPreco();
}
