package Composite.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Caixa extends Componente {
    private List<Componente> itens;

    public Caixa(String nome, double preco){
        super(nome, preco);

        itens = new ArrayList<>();
    }

    public void add(Componente componente){
        itens.add(componente);
    }

    public void rmv(Component component){
        if(itens.contains(component)){
            itens.remove(component);
        }

        throw new RuntimeException("Componente não existe na lista de itens");
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public double getPreco(){
        return this.preco;
    }

    public String getNomeItens(){
        StringBuilder descricao = new StringBuilder(this.nome);

        for (Componente item: itens) {
            descricao.append("\n").append(item.getNome());
        }

        return descricao.toString();
    }
}
