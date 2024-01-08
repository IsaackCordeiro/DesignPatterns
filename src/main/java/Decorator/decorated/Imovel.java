package Decorator.decorated;

import Decorator.calculo.Cotacao;

public class Imovel extends Componente {
    public Imovel(String descricao, double area) {
        super(descricao, area);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPreco() {
        return Cotacao.getInstance().getPrecoUnitario() * area;
    }

    @Override
    public Componente desfazer() {
        return this;
    }

}
