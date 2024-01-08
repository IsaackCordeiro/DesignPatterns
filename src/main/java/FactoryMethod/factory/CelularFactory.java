package FactoryMethod.factory;

import FactoryMethod.model.Celular;
import FactoryMethod.model.Produto;

public class CelularFactory implements EletronicFactory {
    @Override
    public Produto create(){
        return new Celular();
    }
}
