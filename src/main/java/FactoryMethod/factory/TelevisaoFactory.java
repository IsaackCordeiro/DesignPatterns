package FactoryMethod.factory;

import FactoryMethod.model.Produto;
import FactoryMethod.model.Televisao;

public class TelevisaoFactory implements EletronicFactory {
    @Override
    public Produto create(){
        return new Televisao();
    }
}
