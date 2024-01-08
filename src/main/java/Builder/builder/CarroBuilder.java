package Builder.builder;

import Builder.model.Carro;
import Builder.model.Produto;

public class CarroBuilder implements Builder {
    private String nome;
    private double preco;

    @Override
    public void setNomeCarro(String nome){
        this.nome = nome;
    }
    @Override
    public void setPrecoCarro(double preco){
        this.preco = preco;
    }

    @Override
    public Carro getResultado(){
        return new Carro(nome, preco);
    }
}
