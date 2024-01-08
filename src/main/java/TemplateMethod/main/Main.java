package TemplateMethod.main;

import TemplateMethod.template.Receita;
import TemplateMethod.template.ReceitaSopa;

public class Main {
    public static void main(String[] args) {
        Receita sopa = new ReceitaSopa();
        sopa.cook();
    }
}
