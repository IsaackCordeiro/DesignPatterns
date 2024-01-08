package FactoryMethod.main;

import FactoryMethod.factory.CelularFactory;
import FactoryMethod.factory.EletronicFactory;
import FactoryMethod.model.Produto;

public class Main {
    public static void main(String[] args) {
        EletronicFactory factoryCelular = new CelularFactory();
        Produto celular = factoryCelular.create();

        celular.mostrarInfo();

        System.out.println();
    }
}
