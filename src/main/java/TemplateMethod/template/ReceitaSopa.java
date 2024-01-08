package TemplateMethod.template;

public class ReceitaSopa extends Receita {
    @Override
    protected void prepararIngredientes(){
        System.out.println("Preparando ingredientes para receita de Sopa");
    }

    @Override
    protected void cozinharIngredientes(){
        System.out.println("Cozinhando ingredientes para sopa");
    }

    @Override
    protected void servir() {
        System.out.println("Servindo sopa");
    }
}
