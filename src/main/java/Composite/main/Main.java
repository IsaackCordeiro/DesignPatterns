package Composite.main;

import Composite.composite.Caixa;
import Composite.composite.Produto;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("TV", 1000);
        Produto p2 = new Produto("Celular", 800);
        Produto p3 = new Produto("Computador", 3000);

        Caixa caixaPequena = new Caixa("Caixa Pequena", 20);
        Caixa caixaGrande = new Caixa("Caixa Grande", 30);

        caixaPequena.add(p1);
        caixaGrande.add(caixaPequena);
        caixaGrande.add(p2);
        caixaGrande.add(p3);

        System.out.println(caixaGrande.getNomeItens());
    }
}
