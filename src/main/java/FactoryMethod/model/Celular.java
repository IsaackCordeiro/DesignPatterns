package FactoryMethod.model;

public class Celular implements Produto {
    private String modelo;
    private Double preco;

    public String getModelo() {
        return modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Modelo: " + this.modelo + "\nPreco: " + this.preco);
    }
}
