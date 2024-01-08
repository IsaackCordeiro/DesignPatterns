package Decorator.calculo;

public class Cotacao {

    private static Cotacao instance;
    private final double precoUnitario = 3188.98;

    private Cotacao() {

    }

    public static Cotacao getInstance() {
        if (instance == null) {
            instance = new Cotacao();
        }
        return instance;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

}

