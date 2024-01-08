package Builder.main;

import Builder.builder.CarroBuilder;
import Builder.model.Carro;
import Builder.model.Diretor;
import Builder.builder.Builder;
import Builder.model.Produto;

public class Main {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        CarroBuilder carroBuilder = new CarroBuilder();

        Carro carro = diretor.criaCarro(carroBuilder);

        System.out.println(carro);
    }
}
