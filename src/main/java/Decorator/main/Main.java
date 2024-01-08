package Decorator.main;

import Decorator.decorated.Componente;
import Decorator.decorated.Imovel;
import Decorator.decorator.Ambiente;

public class Main {
    public static void main(String[] args) {
        Componente apartamento = new Imovel("Duplex", 20);
        apartamento = new Ambiente(apartamento, "Piscina", 30);
        apartamento = new Ambiente(apartamento, "Suite Master 1", 50);
        apartamento = new Ambiente(apartamento, "Suite Master 2", 50);
        apartamento = new Ambiente(apartamento, "Cozinha", 40);

        System.out.println(apartamento);


    }
}
