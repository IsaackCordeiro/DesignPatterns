package Composite.composite;

public class Produto extends Componente {

    public Produto(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }

}
