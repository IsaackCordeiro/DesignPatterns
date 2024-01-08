package Builder.builder;

import Builder.model.Carro;
import Composite.composite.Produto;

public interface Builder {
    public void setNomeCarro(String nome);
    public void setPrecoCarro(double preco);

    public Carro getResultado();
}
