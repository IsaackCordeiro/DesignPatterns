package Memento.main;

import Memento.memento.ZeladorProduto;
import Memento.model.Produto;

public class Main {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Caderno", 13.20, 19.60);

        ZeladorProduto.getInstancia().add(produto.criarMemento());

        produto.setCusto(21.0);
        System.out.println(produto);

        produto.restaurar(ZeladorProduto.getInstancia().getUltimo());
        System.out.println(produto);
    }
}
