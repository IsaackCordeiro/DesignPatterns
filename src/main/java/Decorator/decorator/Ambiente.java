package Decorator.decorator;

import Decorator.calculo.Cotacao;
import Decorator.decorated.Componente;

public class Ambiente extends Decorador {
    public Ambiente(String descricao, double area) {
        super(null, descricao, area);
    }

    public Ambiente(Componente elementoDecorado, String descricao, double area) {
        super(elementoDecorado, descricao, area);
    }

    @Override
    public String getDescricao() {
        if (elementoDecorado == null) return descricao;
        return this.elementoDecorado.getDescricao() + ", " + descricao;
    }

    @Override
    public double getArea() {
        if (elementoDecorado == null) return area;
        return arredonda(this.elementoDecorado.getArea() + area);
    }

    @Override
    public double getPreco() {
        double precoUnitario = Cotacao.getInstance().getPrecoUnitario();
        if (elementoDecorado == null) return area * precoUnitario;
        return arredonda((this.elementoDecorado.getArea() + area) * precoUnitario);
    }

    @Override
    public Componente desfazer() {
        return elementoDecorado;
    }

    private double arredonda(double valor) {
        return Math.round(valor * 100)/ 100;
    }


}
