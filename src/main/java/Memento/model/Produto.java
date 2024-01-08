package Memento.model;

import Memento.memento.MementoProduto;

public class Produto {
    private String nome;
    private double custo;
    private double preco;

    public Produto(String nome, double custo, double preco) {
        this.nome = nome;
        this.custo = custo;
        this.preco = preco;
    }

    public MementoProduto criarMemento(){
        return new MementoProduto(nome, custo, preco);
    }

    public void restaurar(MementoProduto memento){
        this.nome = memento.getNome();
        this.custo = memento.getCusto();
        this.preco = memento.getPreco();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    double getCusto() {
        return custo;
    }

    String getNome() {
        return nome;
    }
    double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", custo=" + custo +
                ", preco=" + preco +
                '}';
    }
}

