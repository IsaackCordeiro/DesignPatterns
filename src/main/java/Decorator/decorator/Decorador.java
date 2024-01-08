package Decorator.decorator;

import Decorator.decorated.Componente;

public abstract class Decorador extends Componente {
    protected Componente elementoDecorado;
    protected Decorador(String descricao, double area){
        super(descricao, area);
    }

    public Decorador(Componente elementoDecorado, String descricao, double area){
        super(descricao, area);
        this.elementoDecorado = elementoDecorado;
    }
}
