package Builder.model;

import Builder.builder.Builder;

public class Diretor {
    public Carro criaCarro(Builder builder){
        builder.setNomeCarro("Wolksvagem");
        builder.setPrecoCarro(30000);
        return builder.getResultado();
    }
}
